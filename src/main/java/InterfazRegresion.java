import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import edu.uniandes.ecos.regresion.mundo.Regresion;
import edu.uniandes.ecos.regresion.mundo.Resultado;
import java.util.Iterator;
import java.util.LinkedList;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.Spark.get;

/**
 * 
 * @author leonardovalbuenacalderon
 */
public class InterfazRegresion {

  
  public static void main(String[] args) {
      
      
      Regresion reg = new Regresion();
            
      mostrarResultados(reg.iniciarCalculos());

    



  }
  
  /**
   * 
   * @param result 
   */
  public static void  mostrarResultados(LinkedList result) {
      port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/", (req, res) -> getHtml(result));
  }
  
  /**
   * Genera el codigo html del resultado
   * @param result
   * @return 
   */
  public static StringBuffer getHtml(LinkedList result) {
      
      StringBuffer html = new StringBuffer();
      html.append("<!DOCTYPE html>");
      html.append("<html>");
      html.append("<body>");
      html.append("<table border=1>");
      html.append("<tr>");
      html.append("<th>al pelo</th>");
      html.append("<th>B0</th>");
      html.append("<th>B0</th>");
      html.append("<th>B0</th>");
      html.append("<th>B0</th>");
      html.append("</tr>");
      
      Iterator iterador = result.iterator();
        while(iterador.hasNext()) {     
            Resultado res = (Resultado)iterador.next();
            html.append("<tr>");
            html.append("<td>"+ res.getParametroCero() + "</td>");
            html.append("<td>"+ res.getParametroUno()+ "</td>");
            html.append("<td>"+ res.getCoeficiente() + "</td>");
            html.append("<td>"+ res.getPrediccion() + "</td>");
            html.append("<td>"+ res.getYk() + "</td>");
            html.append("</tr>");
        }                               

      html.append("</table>");
      html.append("</body>");
      html.append("</html>");
      
      
      return html;
  }
  

}
