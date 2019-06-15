// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/talshinkar/Google Drive/Technion/Semester H/AndroidNotebook/NotebookServer/conf/routes
// @DATE:Sat Jun 15 13:14:54 IDT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRegistrationController RegistrationController = new controllers.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseNotebookController NotebookController = new controllers.ReverseNotebookController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRegistrationController RegistrationController = new controllers.javascript.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseNotebookController NotebookController = new controllers.javascript.ReverseNotebookController(RoutesPrefix.byNamePrefix());
  }

}
