package pkg2.pkg3.switchcajero;

import java.util.Scanner;
public class SWITCHCAJERO {
    static final int saldo_inicial = 1000;
        static int opcion;
        static double ingreso, saldoActual, retiro;
        
    public static void main(String[] args) {
        cajero(opcion, ingreso, saldoActual, retiro,saldo_inicial);
    }
    public static void cajero (int opcion, double ingreso, double saldoActual, double retiro, int saldo_inicial){
        
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        
        System.out.println("ingresar un número");
        opcion = entrada.nextInt();
        switch (opcion){
            case 1: 
             
        System.out.println("Digite la cantidad que desea ingresar: ");
        ingreso=entrada.nextDouble();
        saldoActual = saldo_inicial + ingreso;
        System.out.println("El saldo actual es: " + saldoActual);
        break;
            case 2:
        System.out.println("Digite la cantidad que desea retirar: ");
        retiro=entrada.nextDouble();
        if (retiro<=saldo_inicial){
        saldoActual = saldo_inicial - retiro;
        System.out.println("Dinero en cuenta: " + saldoActual);
        }
        else{
            System.out.println("No cuenta con el saldo");
        }
        break;
            case 3:
                System.out.println("Hasta luego");
                System.exit(0);
        }
    }
    
}
