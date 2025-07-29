/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesflores_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    /*Varianles Globales*/
    public static String nombres = "Jontahn Alexander";
    public static String apellidos = "Fuentes Flores";
    public static int anio_nacimiento = 2000;
    public static int mes_nacimiento = 5;
    public static float estatura = 1.85f; //metros
    public static float peso = 1.50f;//libras
    public static char genero = 'M';
    public static String estado_familiar = "Soltero";
    public static double salario_mensual = 410d;
    
            
            
    
                                 
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; //a libra equivale a 0.453592 kilogramos
        int dias_laborales = 22; // 22 dias laborales al mes
        int horas_laborales = 8; // 8 horas laborales al dia
        
       //convertir el peso de libras a kilogramos
       float peso_kilogramo = Main.peso * tasa_kilogramo;
       
       //elevando el valor de la estatura al cuadrado
       float estatura_al_cuadrado = Main.estatura*Main.estatura;
       
       //Calcular el indice de masa corporal       
       imc = peso_kilogramo/estatura_al_cuadrado;
        
       //Calculando el salario diario
       double salario_diario = Main.salario_mensual/dias_laborales;
       
       //Calculando el salario por hora
       double salario_hora = salario_diario/horas_laborales;
       
       
       /*******************************/      
       //******Salida de datos*******//
       /******************************/
       
       System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
       System.out.println("Su peso en libras es: "+Main.peso+", pero en kilogramos es:"+peso_kilogramo);
       System.out.println("Su indice de Masa Corporal es: "+imc);
       System.out.println("Su salaeio mensual es: "+Main.salario_mensual);
       System.out.println("Su salariio diario es: "+salario_diario);
       System.out.println("Su salario por hora es:"+salario_hora);
       
       
    }
    
}
