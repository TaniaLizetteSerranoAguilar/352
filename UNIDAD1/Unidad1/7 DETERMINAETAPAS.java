package pkg7.determinaetapas;
import java.util.Scanner;
public class DETERMINAETAPAS {

   static int edad;
    public static void main(String[] args) {
        pedirEdad();
        determinaEtapa(edad);
    }
     public static void pedirEdad(){ 
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce edad: ");
       edad = entrada.nextInt();
     }
     public static void determinaEtapa(int edad){ 
         //INFANTE
         if (edad <= 5 && edad >= 0)
             System.out.println("INFANTE");
         else 
             if (edad < 18 && edad > 5)
                 System.out.println("NIÑO");
         else
                 if 
                         (edad >= 18)
                     System.out.println("ADULTO");
         else
                     System.out.println("NO EXISTEN EDADES MENORES A 0");
                 
       }
       
     
}
