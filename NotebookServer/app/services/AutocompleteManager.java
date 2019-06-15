package services;

import java.util.List;

public interface AutocompleteManager {
    String getType(int expression);
    List<String> autocomplete(int expression, String token);

    void removeToken(int expression);
    String addToken(int expression, String token);

    void removeExpression(int expression);
    int addExpression(String token);
}
