
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Bar],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: play.data.Form[Bar]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

    <script src=""""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("javascripts/index.min.js"))),format.raw/*5.63*/("""" type="text/javascript"></script>

    <ul id="bars"></ul>

    """),_display_(Seq[Any](/*9.6*/helper/*9.12*/.form(action = routes.Application.addBar)/*9.53*/ {_display_(Seq[Any](format.raw/*9.55*/("""
        """),_display_(Seq[Any](/*10.10*/helper/*10.16*/.inputText(form("name")))),format.raw/*10.40*/("""
        <input type="submit"/>
    """)))})),format.raw/*12.6*/("""

""")))})))}
    }
    
    def render(form:play.data.Form[Bar]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((play.data.Form[Bar]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 18 14:09:40 CEST 2014
                    SOURCE: /Users/rafaelrodriguez/Developer/activator-1.2.8-minimal/playapp/app/views/index.scala.html
                    HASH: a29256a656da633740090291383cb0a72e5ff7f8
                    MATRIX: 787->1|908->28|945->31|980->58|1019->60|1074->80|1088->86|1147->124|1247->190|1261->196|1310->237|1349->239|1395->249|1410->255|1456->279|1524->316
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|37->9|37->9|37->9|37->9|38->10|38->10|38->10|40->12
                    -- GENERATED --
                */
            