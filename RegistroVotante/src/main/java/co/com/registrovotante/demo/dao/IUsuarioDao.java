package co.com.registrovotante.demo.dao;

import co.com.registrovotante.demo.entidad.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {
}
