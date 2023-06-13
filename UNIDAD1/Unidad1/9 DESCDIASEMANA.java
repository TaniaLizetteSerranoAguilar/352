package pkg9.descdiasemana;
import java.util.Scanner;

public class DESCDIASEMANA {
 static double mc,d,tp;
 static String dia;
    
 public static void main(String[] args) {
        pedirDatos();
        calcularDescuento(mc,dia,d,tp);
    }
     public static void pedirDatos(){ 
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce Monto de la compra: ");
       mc = entrada.nextDouble();
       System.out.println("Introduce día de la semana: ");
       Scanner sc = new Scanner(System.in);
       dia = sc.nextLine();
     }
     public static void calcularDescuento(double mc,String dia, double d,double tp){
       //DESCUENTO
       if ("martes".equals(dia) || "jueves".equals(dia)) 
           d = (mc * 0.15);
          tp = (mc - d);
          System.out.println("Descuento: " + d);
          System.out.println("Total a pagar: " + tp);
     }
   
}
