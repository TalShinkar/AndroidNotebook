// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/talshinkar/Google Drive/Technion/Semester H/AndroidNotebook/NotebookServer/conf/routes
// @DATE:Sat Jun 15 19:12:10 IDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
