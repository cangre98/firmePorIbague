package co.com.registrovotante.demo.servicio;

import co.com.registrovotante.demo.entidad.Usuario;

public interface IUsuarioServicio {

    void crear(Usuario usuario);

    void editar(Usuario usuario);

    void eliminar(Usuario usuario);
}
