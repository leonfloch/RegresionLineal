
import java.net.URISyntaxException;
import static spark.Spark.get;

import edu.uniandes.ecos.regresion.mundo.Regresion;
import edu.uniandes.ecos.regresion.mundo.Resultado;
import java.util.Iterator;
import java.util.LinkedList;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

/**
 * Clase generica que se encarga de realizar la lectura de los datos del archivo
 * de texto.
 *
 * @author Leonardo Valbuena Calderon
 * @date 29/02/2016
 */
public class InterfazRegresion {

    /**
     * Main de la aplicacion
     *
     * @param args
     */
    //@METODO
    public static void main(String[] args) {
        Regresion reg = new Regresion();
        mostrarResultados(reg.iniciarCalculos());
    }

    /**
     * Utilizando Heroku se muestran los resultados
     *
     * @param result
     */
    //@METODO
    public static void mostrarResultados(LinkedList result) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/", (req, res) -> getHtml(result));
    }

    /**
     * Genera el codigo html del resultado
     *
     * @param result
     * @return
     */
    //@METODO
    public static StringBuffer getHtml(LinkedList result) {
        StringBuffer html = new StringBuffer();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<body>");
        html.append("<table>");
        html.append("<tr>");
        html.append("<td>");
        html.append(getTablaDatosEsperados());
        html.append("</td>");
        html.append("<td>");
        html.append(getTablaDatosActuales(result));
        html.append("</td>");
        html.append("</tr>");
        html.append("</table>");
        html.append("</body>");
        html.append("</html>");
        return html;
    }

    /**
     * html con los datos calculados
     * @param result
     * @return
     */
    //@METODO
    public static StringBuffer getTablaDatosActuales(LinkedList result) {
        StringBuffer html = new StringBuffer();
        html.append("<table border=1>");
        html.append("<tr>");
        html.append("<th>Test</th>");
        html.append("<th colspan=\"5\">Actual Values</th>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<th></th>");
        html.append("<th>Bo</th>");
        html.append("<th>B1</th>");
        html.append("<th>r x,y</th>");
        html.append("<th>r^2</th>");
        html.append("<th>Yk</th>");
        html.append("</tr>");

        Iterator iterador = result.iterator();
        int cont = 1;
        while (iterador.hasNext()) {
            Resultado res = (Resultado) iterador.next();
            html.append("<tr>");
            html.append("<td> Test " + cont++ + "</td>");
            html.append("<td>" + res.getParametroCero() + "</td>");
            html.append("<td>" + res.getParametroUno() + "</td>");
            html.append("<td>" + res.getCoeficienteRxy() + "</td>");
            html.append("<td>" + res.getCoeficienteR2() + "</td>");
            html.append("<td>" + res.getPrediccion() + "</td>");
            html.append("</tr>");
        }
        html.append("</table>");
        return html;
    }

    /**
     * Tabla html con los datos esperados
     * @return tabla html
     */
    //@METODO
    public static StringBuffer getTablaDatosEsperados() {
        StringBuffer html = new StringBuffer();
        html.append("<table border=1>");
        html.append("<tr>");
        html.append("<th>Test</th>");
        html.append("<th colspan=\"5\">Expected Values</th>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<th></th>");
        html.append("<th>Bo</th>");
        html.append("<th>B1</th>");
        html.append("<th>r x,y</th>");
        html.append("<th>r^2</th>");
        html.append("<th>Yk</th>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<td>Test 1</td>");
        html.append("<td>-22.55</td>");
        html.append("<td>1.7279</td>");
        html.append("<td>0.9545</td>");
        html.append("<td>0.9111</td>");
        html.append("<td>644.429</td>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<td>Test 2</td>");
        html.append("<td>-4.039</td>");
        html.append("<td>0.1681</td>");
        html.append("<td>0.9333</td>");
        html.append("<td>.8711</td>");
        html.append("<td>60.858</td>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<td>Test 3</td>");
        html.append("<td>-23.92</td>");
        html.append("<td>1.43097</td>");
        html.append("<td>.9631</td>");
        html.append("<td>.9276</td>");
        html.append("<td>528.4294</td>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<td>Test 4</td>");
        html.append("<td>-4.604</td>");
        html.append("<td>0.140164</td>");
        html.append("<td>.9480</td>");
        html.append("<td>.8988</td>");
        html.append("<td>49.4994</td>");
        html.append("</tr>");
        html.append("</table>");
        return html;

    }

}
