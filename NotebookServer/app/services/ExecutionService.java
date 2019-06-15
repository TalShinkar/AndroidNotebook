package services;

import java.util.List;

public interface ExecutionService {
    List<ExecutionResult> execute(String code);
    AutocompleteManager getAutocompleteManager();
}
