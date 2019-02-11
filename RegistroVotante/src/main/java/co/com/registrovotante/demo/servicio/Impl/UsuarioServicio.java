package co.com.registrovotante.demo.servicio.Impl;

import co.com.registrovotante.demo.servicio.IUsuarioServicio;
import co.com.registrovotante.demo.dao.IUsuarioDao;
import co.com.registrovotante.demo.entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("usuarioServicio")
@Transactional
public class UsuarioServicio implements IUsuarioServicio {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public void crear(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void editar(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
