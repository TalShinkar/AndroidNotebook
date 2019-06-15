package exceptions;

public class ExecutionFailedException extends Throwable {
    private String message;

    public ExecutionFailedException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Execution resulted the following exception:\n" + this.message;
    }
}
