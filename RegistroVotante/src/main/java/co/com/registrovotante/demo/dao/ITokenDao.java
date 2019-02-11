package co.com.registrovotante.demo.dao;

import co.com.registrovotante.demo.entidad.Token;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ITokenDao extends CrudRepository<Token,Long> {
}
