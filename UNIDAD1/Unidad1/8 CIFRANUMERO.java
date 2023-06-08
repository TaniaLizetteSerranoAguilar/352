package pkg8cifranumero;
import java.util.Scanner;
public class CIFRANUMERO {

   static int num;
    public static void main(String[] args) {
         pedirNumero();
        cifraNumero(num);
    }
    public static void pedirNumero(){ 
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce número: ");
       num = entrada.nextInt();
     }
    public static void cifraNumero(int num){ 
         //INFANTE
         if (num < 10 && num >= 0)
             System.out.println("ES DE UNA CIFRA");
         else 
             if (num < 100 && num >= 10)
                 System.out.println("ES DE DOS CIFRAS");
         else
             if (num < 1000 && num >= 100)
             System.out.println("ES DE TRES CIFRAS");
         else 
             if (num < 10000 && num >= 1000)
                 System.out.println("ES DE CUATRO CIFRAS");
         else 
             if (num < 100000 && num >= 10000)
                 System.out.println("ES DE CINCO CIFRAS");
         else 
                 if (num >= 100000)
                     System.out.println("ERROR");           
         else
                 System.out.println("NO EXISTEN NÚMEROS MENORES A 0");                
       }
}
