package controllers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import play.mvc.*;

import services.AppStateService;
import views.html.*;


public class NotebookController extends Controller {
    @Inject @Named("AppState")
    private AppStateService state;

    public Result index() {
        if(this.state.getAuthenticationService().isNotebookRegistered())
            return ok(notebook.render("Android Notebook"));

        return redirect("/register");
    }

}
