package exceptions.managment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionClass {

    // checked exception
    // En algun de un punto existe un catch
    // Son las que deben ser atrapadas en el momento de la creacion de la aplicacion
    public void ExceptioHandlreTryCatch() {
        try{
            new FileInputStream(new File("."));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void ExceptioHandlerThrows() throws FileNotFoundException{
        new FileInputStream(new File("."));
    }

    // Unchecked exception
    // No son necesarias atraparse
    String nombre = null;
    public void handlerUnChecked(){
        nombre.toString();
    }
}