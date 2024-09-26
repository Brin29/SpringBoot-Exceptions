package exceptions.managment.OptionalExceptions;

import exceptions.managment.CustomizedExceptionsTuto.CustomizedExceptions;
import exceptions.managment.CustomizedExceptionsTuto.ExceptionsDetails;

import java.util.Optional;

//Exception details es el error al usuario
public class OptionalClass {

    Optional<String> value = Optional.ofNullable("4SD");

    public void OptionalObject() throws Exception{

        // Evitar los nullpointer exceptions


        value.get(); // Retornar el valor

        if (value.isEmpty()) {
            throw new CustomizedExceptions("El valor esta vacio", new ExceptionsDetails("Ha ocurrido un error inesperado", "error"));
        }

        System.out.println("El valor esta presente");
    }

    //orElse, or, orElse, orElseThrow => que hace si el valor esta vacio
    public void OptionalOrElse() throws Exception {
        // Retornar un valor especifico
        value.orElse("Si el valor esta vacio es 4SD");

    }

    public void OptionalOrElseGet() throws Exception{
        //Ejecutar un metodo
        //value.orElseGet(OptionalObject());

        //Lanza una excepcion
        value.orElseThrow(() -> new CustomizedExceptions("El valor es no esta presente", new ExceptionsDetails("Ocurrio un error en la aplicacion", "error")));
    }

    public void PracticeOptional() throws CustomizedExceptions {
        value.filter(val -> !val.isEmpty() && !val.isBlank()).orElseThrow(() -> new CustomizedExceptions("El valor nos esta presente", new ExceptionsDetails("Error de la aplicacion", "error")));
    }
}
