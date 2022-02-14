package Cuentas;

/**
 * Esta clase contiene los métodos necesarios para trabajar con el objeto CCuenta
 * @author Alejandro García López
 * @version Añadimos version con comentarios a github
 */

public class CCuenta {

    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * Identificador de la cuenta
     */
    private String cuenta;
    /**
     * Registro del salto de cuenta
     */
    private double saldo;
    /**
     * Interés aplicado a la cuenta
     */
    private double tipoInterés;

    /**
     * Devuelve el atributo nombre
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el identificador de la cuenta
     * @return cuenta del titular
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Actualiza el número de cuenta
     * @param cuenta número de cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza el saldo de la cuenta
     * @param saldo edita el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Consulta la cantidad de interés
     * @return devuelve la cantidad de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el interés de la cuenta
     * @param tipoInterés nueva cantidad interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    
    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parámetros     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Identificador de la cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés que tendrá la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Consulta el saldo actual de la cuenta
     * @return getSaldo Devuelve el saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Realiza un ingreso en la cuenta, para sumar la cantidad a la actual
     * @param cantidad que se sumará a la cuenta
     * @throws java.lang.Exception lanza excepción si el número es negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Realiza una retirada de saldo en la cuenta, resta la cantidad al saldo actual
     * @param cantidad que se retirará de la cuenta
     * @throws java.lang.Exception lanza excepción si el número es negativo y si la cantidad es menor que el saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
