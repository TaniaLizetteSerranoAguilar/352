package pkg10.tipoclima;
import java.util.Scanner;
public class TIPOCLIMA {

  static int t;
    public static void main(String[] args) {
        pedirTemperatura();
        tipodeClima(t);
    }
    public static void pedirTemperatura(){ 
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce temperatura en °C: ");
       t = entrada.nextInt(); 
    }
    public static void tipodeClima(int t){
        System.out.println("Tipo de clima: ");
        if (t<=10)
          System.out.println("Frío"); 
        else
            if (t>10 && t<=20)
          System.out.println("Nublado");
        else
                if (t>20 && t<=30)
          System.out.println("Caluroso");  
        else
                    if (t>30)
          System.out.println("Tropical");  
    }
    
    
}
