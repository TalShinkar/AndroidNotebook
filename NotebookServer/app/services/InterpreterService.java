package services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterpreterService implements ExecutionService {
    @Override
    public List<ExecutionResult> execute(String code) {
        List<String> commands = Arrays.stream(code.split(";"))
                .filter(String::isEmpty)
                .map(command -> command + ";")
                .collect(Collectors.toList());

        return null;
    }

    @Override
    public AutocompleteManager getAutocompleteManager() {
        return null;
    }
}
