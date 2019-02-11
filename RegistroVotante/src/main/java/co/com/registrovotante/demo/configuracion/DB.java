package co.com.registrovotante.demo.configuracion;


import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.*;

import javax.sql.DataSource;


@Data
@Configuration
@EnableConfigurationProperties
public class DB {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public propertiesBD properties() {
        return new propertiesBD();
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(properties().getDriverClassName());
        System.out.println("contenido properties: " + properties().toString());
        dataSource.setUrl(properties().getUrl());
        dataSource.setUsername( properties().getUserName());
        dataSource.setPassword( properties().getPassword());
        return dataSource;

    }


    @Data
    private static class propertiesBD {
        private String url;
        private String userName;
        private String password;
        private String driverClassName;
        private String maxActive;
        private String maxIdle;
        private String minIdle;
        private String initialSize;
        private String removeAbandoned;
        private String schema;
    }


}

