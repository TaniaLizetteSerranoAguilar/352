package pkg2.pkg7.for_factorial;

import java.util.Scanner;

public class FOR_FACTORIAL {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Introduce número: ");
        num = entrada.nextInt();
        factorial = 1;
        for (int i= num; i>0; i--) {
            factorial= factorial*i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    
}
