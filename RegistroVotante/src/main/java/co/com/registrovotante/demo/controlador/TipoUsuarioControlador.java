package co.com.registrovotante.demo.controlador;

import co.com.registrovotante.demo.util.ConstantesControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ConstantesControlador.VERSION_AP)
@RestController
public class TipoUsuarioControlador {

   /* @Autowired
    private ITipoUsuarioServicio tipoUsuarioServicio;

    @PostMapping(value = "/" + ConstantesControlador.URL_MAIN_TIPO_USUARIO + "/sing_up", headers = ConstantesControlador.CABECERA_JSON)
    public ResponseEntity<?> crear(@RequestBody TipoUsuarioDTO tipoUsuario) {
        try {

            tipoUsuarioServicio.crear(tipoUsuario);
            return new ResponseEntity<>(tipoUsuario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PostMapping(value = "/10")
    public String crear22(TipoUsuario tipoUsuario) {

        return "";
    }
    */
}
