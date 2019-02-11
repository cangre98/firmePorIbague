package co.com.registrovotante.demo.servicio.Impl;

import co.com.registrovotante.demo.servicio.ITokenServicio;
import co.com.registrovotante.demo.dao.ITokenDao;
import co.com.registrovotante.demo.entidad.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("tokenServicio")
@Transactional
public class TokenServicio implements ITokenServicio {

    @Autowired
    private ITokenDao tokenDao;

    @Override
    public void crear(Token token) {
        tokenDao.save(token);
    }

    @Override
    public void editar(Token token) {
    tokenDao.save(token);
    }

    @Override
    public void eliminar(Token token) {
    tokenDao.delete(token);
    }
}
