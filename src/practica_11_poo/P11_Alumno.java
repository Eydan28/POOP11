/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_11_poo;

/**
 * Clase que representa un alumno con sus datos básicos como nombre, apellidos, número de cuenta, edad y semestre.
 * Proporciona métodos para acceder y modificar los atributos del alumno.
 * También incluye un método para simular la acción de estudiar.
 * 
 * @author lenovo
 */
public class P11_Alumno {
    
    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int semestre;

    /**
     * Constructor vacío de la clase P11_Alumno.
     */
    public P11_Alumno() {
    }

    /**
     * Constructor que inicializa todos los atributos del alumno.
     * 
     * @param nombre Nombre del alumno.
     * @param apPat Apellido paterno del alumno.
     * @param apMat Apellido materno del alumno.
     * @param numCuenta Número de cuenta del alumno.
     * @param edad Edad del alumno.
     * @param semestre Semestre actual del alumno.
     */
    public P11_Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * 
     * @param nombre Nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del alumno.
     * 
     * @return Apellido paterno del alumno.
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Establece el apellido paterno del alumno.
     * 
     * @param apPat Apellido paterno del alumno.
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Obtiene el apellido materno del alumno.
     * 
     * @return Apellido materno del alumno.
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Establece el apellido materno del alumno.
     * 
     * @param apMat Apellido materno del alumno.
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Obtiene el número de cuenta del alumno.
     * 
     * @return Número de cuenta del alumno.
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Establece el número de cuenta del alumno.
     * 
     * @param numCuenta Número de cuenta del alumno.
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Obtiene la edad del alumno.
     * 
     * @return Edad del alumno.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del alumno.
     * 
     * @param edad Edad del alumno.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el semestre actual del alumno.
     * 
     * @return Semestre actual del alumno.
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre actual del alumno.
     * 
     * @param semestre Semestre actual del alumno.
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Simula la acción de estudiar del alumno.
     * Imprime un mensaje indicando que el alumno está estudiando.
     */
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    /**
     * Devuelve una representación en cadena de los atributos del alumno.
     * 
     * @return Cadena con los atributos del alumno separados por comas.
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre;
    }
}
