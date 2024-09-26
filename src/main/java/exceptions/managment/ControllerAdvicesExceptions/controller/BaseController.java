package exceptions.managment.ControllerAdvicesExceptions.controller;

import exceptions.managment.CustomizedExceptionsTuto.CustomizedExceptions;
import exceptions.managment.CustomizedExceptionsTuto.ExceptionsDetails;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(BaseController.class.getName());

    // Para que excepciones sirve el metodo
    @ExceptionHandler(value = {CustomizedExceptions.class})
    public ResponseEntity<ExceptionsDetails> handleCustomizedException(CustomizedExceptions exceptions){

        LOG.error(exceptions.getMessage(), exceptions.getCause());
        return new ResponseEntity<>(exceptions.getDetails(), HttpStatus.BAD_REQUEST);
    }
}
