
package pkg5.funcmayoredad;
import java. util.Scanner;

public class FUNCMAYOREDAD {

   
    public static void main(String[] args) {
        //Declaración de variables
       Scanner entrada= new Scanner(System.in);
       int numero;
       //Entrada de datos
       System.out.println("Introduce edad");
       numero = entrada.nextInt();
       //Salida de datos
       System.out.println(retornaEdad(numero));
       
    }
    public static String retornaEdad(int num){
        //Declaración de varoables 
        int edad;
        //Proceso de datos
        edad=num;
        //Salia de datos
        if (edad >=18 ){
            return "Mayor de edad";
        }
        return "Menor de edad";
        
    }
    
}
