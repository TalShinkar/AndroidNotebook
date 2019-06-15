package services;

import exceptions.ExecutionFailedException;
import exceptions.IllegalStatusException;

public class ExecutionResult {
    public enum Status { SUCCESS, EXCEPTION }

    private Status status;
    private String output;
    private String result;
    private String exception;

    public ExecutionResult(Status status, String output, String result, String exception) {
        this.status = status;
        this.output = output;
        this.result = result;
        this.exception = exception;
    }

    public String getOutput() {
        return this.output;
    }

    public String getResult() throws ExecutionFailedException {
        if(this.status == Status.SUCCESS)
            return this.result;

        if(this.status == Status.EXCEPTION)
            throw new ExecutionFailedException(this.exception);

        throw new IllegalStatusException();
    }
}
