package pkg3.pkg4.maquina_golosinas;

import java.util.Scanner;
import java.io.*;
import static pkg3.pkg4.maquina_golosinas.MAQUINA_GOLOSINAS.*; 
public class MAQUINA_GOLOSINAS {
// DECLARACIÓN DE VARIABLES
    static int [] clave = {123,456,789,321,674};
    static int [] cantidad = {100,200,300, 400,500};
    static int OP,c,p,pedir,totalg;
    public static void main(String[] args) {
        MENU();
    }
    //FUNCION DE MENU
    public static void MENU (){   
      while (OP < 5)
      {
     // TABLA DE GOLOSINAS
     System.out.println("********************************************");
     System.out.println("Clave    Producto           Cantidad        ");
     System.out.println(+clave[0]+"    Chocolates    "+"         " +cantidad[0]);
     System.out.println(+clave[1]+"    Paletas       "+"         " +cantidad[1]);
     System.out.println(+clave[2]+"    Papas         "+"         " +cantidad[2]);
     System.out.println(+clave[3]+"    Chicles       "+"         " +cantidad[3]);
     System.out.println(+clave[4]+"    Gomitas       "+"         " +cantidad[4]);
     
     //ELEGIR UNA OPCION DEL MENU
     System.out.println("********************************************");
     System.out.println("                                            ");
     System.out.println("     MENU GOLOSINAS               ");
     System.out.println("1. Mostrar golosinas");
     System.out.println("2. Pedir golosina");
     System.out.println("3. Rellenar golosina");
     System.out.println("4. Grabar");
     System.out.println("5. Apagar máquina");
     System.out.println("********************************************");
     System.out.println("                                            ");
     //ENTRADA DE DATOS
     System.out.println("Elija una opción:");
     Scanner entrada= new Scanner(System.in);
     OP = entrada.nextInt();
     totalg=cantidad[0]+cantidad[1]+cantidad[2]+cantidad[3]+cantidad[4];
     switch (OP){
        case 1: 
             MOSTRAR();
        break;
        case 2: 
             PEDIR();
        break;
        case 3: 
             RELLENAR();
        break;
        case 4: 
            //CREAR ARCHIVO
            GRABAR("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\TOTAL DE GOLOSINAS.txt");
            //ESCRIBIR EN EL ARCHIVO
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\TOTAL DE GOLOSINAS.txt","TOTAL DE GOLOSINAS: ");
            GRABAR2("C:\\Users\\Tania\\Desktop\\Unidad3\\ARCHIVOS\\TOTAL DE GOLOSINAS.txt",""+ totalg);
            
        break;
        case 5: 
             System.out.println("Hasta luego");
                System.exit(0);
        default:
                    System.out.println("OPCIÓN NO VALIDA");
    }
      }
    
} 
    //FUNCIONES
    public static void MOSTRAR (){   
     System.out.println("********************************************");
     System.out.println("Clave    Producto           Cantidad        ");
     System.out.println(+clave[0]+"    Chocolates    "+"         " +cantidad[0]);
     System.out.println(+clave[1]+"    Paletas       "+"         " +cantidad[1]);
     System.out.println(+clave[2]+"    Papas         "+"         " +cantidad[2]);
     System.out.println(+clave[3]+"    Chicles       "+"         " +cantidad[3]);
     System.out.println(+clave[4]+"    Gomitas       "+"         " +cantidad[4]);
} 
    public static void PEDIR (){   
    System.out.println("Introduce clave del producto");    
    Scanner entrada= new Scanner(System.in);
     c = entrada.nextInt();
    System.out.println("Cantidad que desea pedir");
    p = entrada.nextInt();
    if (c == clave[0]){
        pedir=cantidad[0]-p;
         cantidad[0]=pedir;
    System.out.println("Gracias por su compra");
    }
    else if (c == clave[1]){
        pedir=cantidad[1]-p;
         cantidad[1]=pedir;
    System.out.println("Gracias por su compra");
    }       
    else if (c == clave[2]){
        pedir=cantidad[2]-p;
         cantidad[2]=pedir;
    System.out.println("Gracias por su compra");
    }
    else if (c == clave[3]){
        pedir=cantidad[3]-p;
         cantidad[3]=pedir;
    System.out.println("Gracias por su compra");
    }
    else if (c == clave[4]){
        pedir=cantidad[4]-p;
         cantidad[4]=pedir;
    System.out.println("Gracias por su compra");
    }
} 
    public static void RELLENAR (){   
    System.out.println("Introduce clave del producto");    
    Scanner entrada= new Scanner(System.in);
     c = entrada.nextInt();
    System.out.println("Cantidad que desea rellenar");
    p = entrada.nextInt();
    if (c == clave[0]){
        pedir=cantidad[0]+p;
         cantidad[0]=pedir;
    System.out.println("Gracias");
    }
    else if (c == clave[1]){
        pedir=cantidad[1]+p;
         cantidad[1]=pedir;
    System.out.println("Gracias");
    }       
    else if (c == clave[2]){
        pedir=cantidad[2]+p;
         cantidad[2]=pedir;
    System.out.println("Gracias");
    }
    else if (c == clave[3]){
        pedir=cantidad[3]+p;
         cantidad[3]=pedir;
    System.out.println("Gracias");
    }
    else if (c == clave[4]){
        pedir=cantidad[4]+p;
         cantidad[4]=pedir;
    System.out.println("Gracias");
    }
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
