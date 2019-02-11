package co.com.registrovotante.demo.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControlador {
    @RequestMapping(value = "/")
public ResponseEntity<String> index(){
        return new ResponseEntity<>("Hi ",HttpStatus.OK);
    }


}
