package co.com.registrovotante.demo.servicio.Impl;

import co.com.registrovotante.demo.servicio.IVontanteServicio;
import co.com.registrovotante.demo.dao.IVotanteDao;
import co.com.registrovotante.demo.entidad.Votante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("votanteServicio")
@Transactional
public class VotanteServicio implements IVontanteServicio {

    @Autowired
    private IVotanteDao votanteDao;


    @Override
    public void crear(Votante votante) {
        votanteDao.save(votante);
    }

    @Override
    public void editar(Votante votante) {
    votanteDao.save(votante);
    }

    @Override
    public void eliminar(Votante votante) {
    votanteDao.delete(votante);
    }
}
