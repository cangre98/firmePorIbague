package co.com.registrovotante.demo.servicio;

import co.com.registrovotante.demo.entidad.Votante;

public interface IVontanteServicio {

    void crear(Votante votante );

    void editar(Votante votante);

    void eliminar(Votante votante);
}
