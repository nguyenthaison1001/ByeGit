package Main;

public class IllegalTimeException extends Exception{
    private final String message;

    public IllegalTimeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
