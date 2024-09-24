package exceptions.managment;

// Detalles de la excepcion
public class ExceptionsDetails {

    private String userMessage;
    private String severity;

    public ExceptionsDetails(String userMessage, String severity) {
        this.userMessage = userMessage;
        this.severity = severity;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}