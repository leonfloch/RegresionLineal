package edu.uniandes.ecos.regresion.mundo;

/**
 * Representa cada uno de los valores calculados en la regresion lineal
 * @author Leonardo Valbuena Calderon
 * @date 29/02/2016
 */
public class Resultado {
    
    /**
     * parametro B0
     */
    private double parametroCero;
    
    /**
     * parametro B1
     */
    private double parametroUno;
    
    /**
     * Correlacion coeficientes r x,y
     */
    private double coeficienteRxy;
    
    /**
     * Correlacion coeficientes r 2
     */
    private double coeficienteR2;
    
    /**
     * Calculo prediccion mejorada
     */
    private double prediccion;

    /**
     * Constructor
     * @param parametroCero
     * @param parametroUno
     * @param coeficienteRxy
     * @param coeficienteR2
     * @param prediccion 
     */
    //@METODO
    public Resultado(double parametroCero, double parametroUno, double coeficienteRxy, 
            double coeficienteR2, double prediccion) {
        this.parametroCero = parametroCero;
        this.parametroUno = parametroUno;
        this.coeficienteRxy = coeficienteRxy;
        this.coeficienteR2 = coeficienteR2;
        this.prediccion = prediccion;
    }

    

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroCero() {
        return this.redondeo(parametroCero);
    }

    /**
     * 
     * @param parametroCero 
     */
    //@METODO
    public void setParametroCero(double parametroCero) {
        this.parametroCero = parametroCero;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroUno() {
        return this.redondeo(parametroUno);
    }

    /**
     * 
     * @param parametroUno 
     */
    //@METODO
    public void setParametroUno(double parametroUno) {
        this.parametroUno = parametroUno;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteRxy() {
        return this.redondeo(coeficienteRxy);
    }

    /**
     * 
     * @param coeficienteRxy 
     */
    //@METODO
    public void setCoeficienteRxy(double coeficienteRxy) {
        this.coeficienteRxy = coeficienteRxy;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteR2() {
        return this.redondeo(coeficienteR2);
    }

    /**
     * 
     * @param coeficienteR2 
     */
    //@METODO
    public void setCoeficienteR2(double coeficienteR2) {
        this.coeficienteR2 = coeficienteR2;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getPrediccion() {
        return this.redondeo(prediccion);
    }

    /**
     * 
     * @param prediccion 
     */
    //@METODO
    public void setPrediccion(double prediccion) {
        this.prediccion = prediccion;
    }
    
    /**
     * realiza redondeo a 4 cifras
     * @param valor
     * @return 
     */
    //@METODO
    public double redondeo(double valor) {
        int cifras=(int) Math.pow(10,4);
        return Math.rint(valor * cifras) / cifras;
    }
    
    
    
}
