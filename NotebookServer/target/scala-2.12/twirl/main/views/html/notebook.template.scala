
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object notebook extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("/javascripts/console.js")),format.raw/*16.73*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("/codemirror/lib/codemirror.js")),format.raw/*18.79*/(""""></script>
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("/codemirror/lib/codemirror.css")),format.raw/*19.96*/("""">
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("/codemirror/mode/javascript/javascript.js")),format.raw/*20.91*/(""""></script>

        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("/node_modules/@webcomponents/webcomponentsjs/webcomponents-bundle.js")),format.raw/*22.118*/(""""></script>
        <script type="module" src=""""),_display_(/*23.37*/routes/*23.43*/.Assets.versioned("/modules/code-playground/code-playground.js")),format.raw/*23.107*/(""""></script>

    </head>
    <body>
        <code-playground></code-playground>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 15 20:58:41 IDT 2019
                  SOURCE: /Users/talshinkar/Google Drive/Technion/Semester H/AndroidNotebook/NotebookServer/app/views/notebook.scala.html
                  HASH: dbb498c86d52837f459e241e37a85c76c4794b9a
                  MATRIX: 1205->260|1314->276|1341->277|1421->382|1457->391|1492->399|1518->404|1607->466|1622->472|1685->513|1773->574|1788->580|1849->619|1901->644|1916->650|1981->694|2066->752|2081->758|2152->808|2229->858|2244->864|2316->915|2368->940|2383->946|2466->1008|2528->1043|2543->1049|2654->1138|2729->1186|2744->1192|2830->1256
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|52->22|52->22|52->22|53->23|53->23|53->23
                  -- GENERATED --
              */
          