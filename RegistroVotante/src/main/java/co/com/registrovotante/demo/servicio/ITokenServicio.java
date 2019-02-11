package co.com.registrovotante.demo.servicio;

import co.com.registrovotante.demo.entidad.Token;

public interface ITokenServicio {

    void crear(Token token);

    void editar(Token token);

    void eliminar(Token token);
}
