
package pkg4.v3trifiv;

import java. util.Scanner;
public class V3TRIFIV {

    public static void main(String[] args) {
       //Declaración de variables
       Scanner entrada= new Scanner(System.in);
       int numero;
       //Entrada de datos
       System.out.println("Dame el número");
       numero = entrada.nextInt();
       //Salida de datos
       System.out.println(retornaMultiplo(numero));
       
    }
    public static String retornaMultiplo(int num){
        //Declaración de varoables 
        int mult3, mult5;
        //Procesamiento de datos
        mult3 = num %3;
        mult5 = num %5;
        //Salia de datos
        if (mult3 == 0 && mult5 == 0 ){
            return "TRIFIV";
        }
        else if (mult3 == 0){
            return "TRI";
        }
        else if (mult5 == 0){
            return "FIV";
        }
        return "Ningún caso";
        
    }
}
