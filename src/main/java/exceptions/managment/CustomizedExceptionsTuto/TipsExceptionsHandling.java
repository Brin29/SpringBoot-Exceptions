package exceptions.managment.CustomizedExceptionsTuto;

import org.springframework.util.ObjectUtils;

public class TipsExceptionsHandling {

    public void ExceptionHandling() throws CustomizedExceptions {
        if (ObjectUtils.isEmpty(0)){
            throw new CustomizedExceptions("The args parameter is empty",
                    new ExceptionsDetails("Ha ocurrido un error inesperado", "error"));
        }

        try{

        }
        // Reporte de Jasper
        catch (Exception e){
            throw new CustomizedExceptions("Ocurrio un error generando jasper", new ExceptionsDetails("Ha ocurrido un error generando el reporte", "warning"), e);
        }

    }


}
