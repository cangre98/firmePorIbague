package co.com.registrovotante.demo.entidad.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

public enum TipoDocumento  implements Serializable {
    VACIA(""),
    @JsonProperty("CEDULA")
    CEDULA("CEDULA"),
    @JsonProperty("CEDULA_EXTRANJERA")
    CEDULA_EXTRANJERA("CEDULA EXTRANJERA");

    @Getter
    private String nombre;

    private TipoDocumento(String nombre){
        this.nombre = nombre;
    }
}
