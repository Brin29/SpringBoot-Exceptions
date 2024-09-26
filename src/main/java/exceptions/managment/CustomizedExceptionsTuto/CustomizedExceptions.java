package exceptions.managment.CustomizedExceptionsTuto;

// Excepciones personalizadas
// Checked exceptions
// Agregarle atributos adicionales a la clase y msa informacion
// Su objetivo es proveer informacion
public class CustomizedExceptions extends Exception{

    private static final long serialVersionUID = 7095147998863479282L;

    private ExceptionsDetails details;

    public CustomizedExceptions(String message, ExceptionsDetails details, Throwable e){
        super(message, e);
        setDetails(details);
    }

    public CustomizedExceptions(String message, ExceptionsDetails details){
        super(message);
        setDetails(details);
    }

    public ExceptionsDetails getDetails() {
        return details;
    }

    public void setDetails(ExceptionsDetails details) {
        this.details = details;
    }
}
