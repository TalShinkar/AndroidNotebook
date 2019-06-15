package services;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class AppStateService {
    private ExecutionService executionService;
    private AuthenticationService authenticationService;

    @Inject
    public AppStateService(ExecutionService executionService, AuthenticationService authenticationService) {
        this.executionService = executionService;
        this.authenticationService = authenticationService;
    }


    public AuthenticationService getAuthenticationService() {
        return this.authenticationService;
    }

    public ExecutionService getExecutionService() {
        return this.executionService;
    }
}
