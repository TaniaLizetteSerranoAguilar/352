package pkg3.pkg6.encuestas;
import java.util.Scanner;
import java.io.*;
public class ENCUESTAS {
    //DECLARACIÓN DE VARIABLES
    static int 
        sexo,trabajo,sueldo,i,total_trabajoh=0,masculino = 0,femenino = 0,trabajo_no = 0,
        trabajo_si = 0,trabajo_sim=0, hombrest=0, prom_hombres_siT=0, sueldoh=0,
        sueldom=0,suma,porcentaje_hnotrabaja, porcentaje_hsitrabaja,porcentaje_msitrabaja,
        porcentaje_m,prom_mujeres_siT,sueldoph,sueldopm,sueldostotales,OP;
    
    public static void main(String[] args) {
        MENU();
    }
    public static void MENU (){  
     while (OP < 4){
     System.out.println("********************************************");
     System.out.println("                                           ");
     System.out.println("     MENU                                  ");
     System.out.println("1. Encuesta");
     System.out.println("2. Grabar");
     System.out.println("3. Salir");
     System.out.println("********************************************");
     System.out.println("                                            ");
     System.out.println("Elija una opción:");
     Scanner entrada= new Scanner(System.in);
     OP = entrada.nextInt();
     switch (OP){
        case 1: 
             ENCUESTA();
        break;
        case 2: 
             //CREAR ARCHIVO
            GRABAR("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt");
            //ESCRIBIR EN EL ARCHIVO
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","REULTADOS DE ENCUESTA: ");
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","Porcentaje de hombres que no trabajan: " + porcentaje_hnotrabaja );
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","Porcentaje de mujeres: " + porcentaje_m);
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","Sueldo promedio de hombres: " + prom_hombres_siT);
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","Sueldo promedio de mujeres: " + prom_mujeres_siT );
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\ENCUESTA.txt","Sueldos totales hombres y mujeres: " + sueldostotales);
        break;
        case 3: 
             System.out.println("Hasta luego");
                System.exit(0);
        default:
                    System.out.println("OPCIÓN NO VALIDA");
     }
        }
    }
    public static void ENCUESTA (){
        //ENTRADA DE DATOS
        for (i=1; i<=5; i++){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Sexo:");
        System.out.println("1. Masculino");
        System.out.println("2. Femenino");
        sexo = entrada.nextInt();
        System.out.println("¿Trabaja?");
        System.out.println("1. Si");
        System.out.println("2. No");
        trabajo = entrada.nextInt();
        if (trabajo == 1){
            System.out.println("Introduzca su suldo: $ ");
            sueldo = entrada.nextInt();   
        }
        
        if (sexo == 1){
            masculino++;
        }
        for(int a=0;a<4;a++){
            if (sexo==1 && trabajo==1){
            trabajo_si++;
            sueldoh=sueldoh+sueldo;
        }
        }
        for(int b=0;b<4;b++){
            if (sexo==2 && trabajo==1){
            trabajo_sim++;
            sueldom=sueldom+sueldo;
        }
        }
        if (sexo == 2){
            femenino++;
        }
        
        if (trabajo == 2){
            trabajo_no++;
        }
        }
      //PORCENTAJE DE HOMBRES QUE NO TRABAJAN
      porcentaje_hnotrabaja = (trabajo_no*100)/5;
      System.out.println("Porcentaje de hombres que no trabajan: " + porcentaje_hnotrabaja);
      //PORCENTAJE DE MUJERES EN GENERAL
      porcentaje_m= (femenino*100)/5;
      System.out.println("Porcentaje de mujeres: " + porcentaje_m);
      //SUELDO PROMEDIO DE HOMBRES
      porcentaje_hsitrabaja = (trabajo_si*100)/5;
      prom_hombres_siT = sueldoh/trabajo_si;
      System.out.println("Sueldo promedio de hombres: " + prom_hombres_siT);
      //SUELDO PROMEDIO DE MUJERES
      porcentaje_msitrabaja = (trabajo_sim*100)/5;
      prom_mujeres_siT = sueldom/trabajo_sim;
      System.out.println("Sueldo promedio de mujeres: " + prom_mujeres_siT );
      //SUELDOS TOTALES
      sueldostotales=(prom_hombres_siT+prom_mujeres_siT);
      System.out.println("Sueldos totales hombres y mujeres: " + sueldostotales);
    }
    public static void GRABAR (String nombreArchivo){ 
        File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter (archivo);
            salida.close();
            System.out.println("Se creó archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
  }
    public static void GRABAR2 (String nombreArchivo, String contenido){ 
        File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se grabó archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out); 
        }
        
  } 
}
