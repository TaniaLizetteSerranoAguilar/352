package pkg2.pkg10.do_acumulador;

import java.util.Scanner;
public class DO_ACUMULADOR {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma;
        suma=0;
        do{
            System.out.println("Introduzca el número: ");
            num = entrada.nextInt();   
            suma=suma + num;
        } while (num!=0); 
        
        System.out.println("La suma de todos es: " + suma); 
    }
    
}
