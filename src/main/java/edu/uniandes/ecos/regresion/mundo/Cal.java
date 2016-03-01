package edu.uniandes.ecos.regresion.mundo;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author leonardo valbuena calderon
 * Clase que se encarga de realizar los calculos de la media 
 * y la desviacion estandar
 */
public class Cal {
    
    /**
     * Se encarga de calcular la media para una lista de valores 
     * enviado
     * @param valores lista de valores 
     * @return valor de la media 
     */
    //@METODO
//    public static double calcularMedia(LinkedList valores) {
//        double media;
//        double suma = 0;
//        
//        Iterator iterador = valores.iterator();
//        while(iterador.hasNext()) {
//            suma += (double)iterador.next();
//        }        
//        media = suma / valores.size();
//
//        //redondeo
//        int cifras=(int) Math.pow(10,2);
//        media = Math.rint(media * cifras) / cifras;        
//        
//        return media;
//    }
    
    /**
     * Se encarga de calcular la desviacion estandar 
     * @param media valor de la media
     * @param valores lista de valores 
     * @return valor de la desviacion estandar 
     */
    //@METODO
//    public static double calcularDesviacionEstandar(double media, LinkedList valores) {
//        double desvEstandar;        
//        double suma = 0;
//        
//        Iterator iterador = valores.iterator();
//        while(iterador.hasNext()) {                        
//            double resta = (double)iterador.next() - media;              
//            suma += Math.pow(resta, 2);
//        }        
//        desvEstandar = Math.sqrt(suma / (valores.size()-1));
//        
//        //se realiza redondeo
//        int cifras=(int) Math.pow(10,2);
//        desvEstandar = Math.rint(desvEstandar * cifras) / cifras;        
//        return desvEstandar;
//    }
    
    /**
     * Realiza la sumatoria de una lista de valores
     * @param valores datos que se van a sumar
     * @return suma de todos los valores
     */
    //@METODO
    public static double sumatoria(LinkedList valores) {
        double resultado = 0;        
        Iterator iterador = valores.iterator();
        while(iterador.hasNext()) {                                    
            resultado += (Double)iterador.next();
        }
        return resultado;        
    }
    
    /**
     * por cada valor de la lista se eleva al cuadrado y se realiza sumatoria
     * @param valores datos a calcular
     * @return 
     */
    //@METODO
    public static double sumElevarAlCuadrado(LinkedList valores) {
        double resultado = 0;        
        Iterator iterador = valores.iterator();
        while(iterador.hasNext()) {                                    
            double valor = (Double)iterador.next();
            resultado += Math.pow(valor, 2);
        }
        return resultado;        
    }
    
    /**
     * se toman los valores de las listas, se multiplican y se realiza sumatoria
     * @param valoresX datos a clacular
     * @param valoresY datos a calcular
     * @return resultado de la sumatoria
     */
    public static double sumMultiplicacion(LinkedList valoresX, 
            LinkedList valoresY) {
        double resultado = 0;        
        int cont = 0;
        Iterator iteradorX = valoresX.iterator();
        while(iteradorX.hasNext()) {
            resultado += (Double)valoresY.get(cont) * (Double)iteradorX.next();                    
            cont++;
        }
        return resultado;
    }
    
    
}
