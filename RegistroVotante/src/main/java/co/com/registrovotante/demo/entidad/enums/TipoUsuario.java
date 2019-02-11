package co.com.registrovotante.demo.entidad.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

public enum TipoUsuario implements Serializable {
    VACIO(""),
    @JsonProperty("ADMINISTRADOR")
    ADMINISTRADOR("ADMINISTRADOR"),
    @JsonProperty("OPERARIO")
    OPERARIO("OPERARIO");

    @Getter
    private String nombre;

    TipoUsuario(String nombre) {
        this.nombre = nombre;
    }
}
