package pkg2.pkg8.while_cuadrado;
import java.util.Scanner;
public class WHILE_CUADRADO {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Introduzca el número: ");
        num = entrada.nextInt();
        while(num>=0){
            cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es igual a " + cuadrado);
            System.out.println("");
            System.out.println("Introduzca un número: ");
            num = entrada.nextInt();
        }
    }
    
}
