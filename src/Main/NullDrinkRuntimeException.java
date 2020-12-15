package Main;

public class NullDrinkRuntimeException extends RuntimeException{
    private final String message;

    public NullDrinkRuntimeException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
