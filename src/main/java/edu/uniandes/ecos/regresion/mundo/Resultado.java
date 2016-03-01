package edu.uniandes.ecos.regresion.mundo;

/**
 * Representa cada uno de los valores calculados en la regresion lineal
 * @author Leonardo Valbuena Calderon
 * @date 29/02/2016
 */
public class Resultado {
    
    /**
     * 
     */
    private double parametroCero;
    
    /**
     * 
     */
    private double parametroUno;
    
    /**
     * 
     */
    private double coeficiente;
    
    /**
     * 
     */
    private double prediccion;
    
    /**
     * 
     */
    private double yk;

    /**
     * Constructor
     * @param parametroCero
     * @param parametroUno
     * @param coeficiente
     * @param prediccion
     * @param yk 
     */
    public Resultado(double parametroCero, double parametroUno, double coeficiente, double prediccion, double yk) {
        this.parametroCero = parametroCero;
        this.parametroUno = parametroUno;
        this.coeficiente = coeficiente;
        this.prediccion = prediccion;
        this.yk = yk;
    }
    
    
    
    

    /**
     * Constructor
     */
    //@METODO
    public Resultado() {
        
    }
    
    
    
    
    

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroCero() {
        return parametroCero;
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
        return parametroUno;
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
    public double getCoeficiente() {
        return coeficiente;
    }

    /**
     * 
     * @param coeficiente 
     */
    //@METODO
    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getPrediccion() {
        return prediccion;
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
     * 
     * @return 
     */
    //@METODO
    public double getYk() {
        return yk;
    }

    /**
     * 
     * @param yk 
     */
    //@METODO
    public void setYk(double yk) {
        this.yk = yk;
    }
    
    
    
}
