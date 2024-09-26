package exceptions.managment.ControllerAdvicesExceptions.controller;

import exceptions.managment.CustomizedExceptionsTuto.CustomizedExceptions;
import exceptions.managment.CustomizedExceptionsTuto.ExceptionsDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controlar lo que sucede con las excepciones
@RestController
public class UserController {

    @GetMapping("/{id}")
    public String validateStatus(@PathVariable Integer id) throws CustomizedExceptions {
        if (id == null || id == 0){
            throw new CustomizedExceptions("Id invalue", new ExceptionsDetails("Ha ocurrido un error inesperado, por favor contacte con el administrador", "error"));
        }

        return "Usuario activo";
    }

}
