package co.com.registrovotante.demo.dao;

import co.com.registrovotante.demo.entidad.Votante;
import org.springframework.data.repository.CrudRepository;

public interface IVotanteDao extends CrudRepository<Votante,Long> {
}
