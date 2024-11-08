/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_11_poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase principal para la práctica 11 de POO, que incluye la creación y manipulación
 * de archivos, manejo de tokens y uso de una lista de objetos de tipo P11_Alumno.
 * Permite leer y escribir archivos, tokenizar cadenas y manipular listas de alumnos.
 * 
 * @version 1.0
 * @since 2023
 * 
 * @see P11_Alumno
 */
public class Practica_11_POO {

    /**
     * Método principal de la clase. Ejecuta diversas operaciones de lectura y escritura
     * en archivos, tokenización de cadenas, creación de instancias de alumnos y manipulación
     * de una lista de alumnos.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
        File archivo = new File("archivo.txt");
        
        // Verifica si el archivo existe y lo crea si no.
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Escribe texto en el archivo utilizando BufferedWriter y PrintWriter.
        System.out.println("############### FileWriter ###############");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);

            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto);
            salida.println("Esta es la segunda Linea");

            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
            }

            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
            }

            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Lee el contenido del archivo utilizando FileReader y BufferedReader.
        System.out.println("############### FileReader ###############");
        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");

            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Tokeniza una cadena de texto para dividir los datos de un alumno.
        System.out.println("############### StringTokenizer ###############");
        String alumnoParseado = "Eric Fernando,Soto,Bolaños,321302740,18,3"; 
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        System.out.println(alumnoParseado);

        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }

        // Crea y muestra varias instancias de P11_Alumno.
        System.out.println("############### Clase alumno ###############");
        P11_Alumno alumno1 = new P11_Alumno("Alan", "Hernandez", "Flores", 321302740, 19, 3);
        System.out.println(alumno1);
        
        P11_Alumno alumno2 = new P11_Alumno("Halley", "Mendoza", "Sanchez", 321254601, 19, 3);
        System.out.println(alumno2);
        
        P11_Alumno alumno3 = new P11_Alumno("Juan", "Fernandez", "Marquez", 323568532, 20, 4);
        System.out.println(alumno3);
        
        P11_Alumno alumno4 = new P11_Alumno("Jose", "Gonzales", "Gutierrez", 335779423, 18, 1);
        System.out.println(alumno4);
        
        P11_Alumno alumno5 = new P11_Alumno("Maria", "Escalante", "Flores", 323578953, 20, 2);
        System.out.println(alumno5);

        // Agrega los alumnos a una lista y la muestra.
        ArrayList<P11_Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        System.out.println(lista);
        
        // Escribe la lista de alumnos en un archivo de texto.
        System.out.println("\nEscribiendo en el archivo txt\n");
        try {
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            for (P11_Alumno alumno : lista) {
                salida.println(alumno);
            }

            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
