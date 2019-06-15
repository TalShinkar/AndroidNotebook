package controllers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import play.mvc.*;
import services.AppStateService;

public class RegistrationController extends Controller {
    @Inject @Named("AppState")
    private AppStateService state;

    public Result index() {
        return ok("This page is for app registration");
    }
}
