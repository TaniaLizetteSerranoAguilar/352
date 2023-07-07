package pkg3.pkg3.facturas;

import java.util.Scanner;


public class FACTURAS {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int factura,c,fmayor_10000 = 0, fmax = 0, fmin = 0;
    double l,p, importe, lp1 = 0, im=0;
        for (int i=1; i<=5; i++){
            System.out.println("Introduzca factura " + i + ":");
            factura=entrada.nextInt();
            System.out.println("Introduzca código del producto: ");
            c=entrada.nextInt();
            System.out.println("Cantidad de litros comprados: ");
            l=entrada.nextDouble();
            System.out.println("Precio por litro: ");
            p=entrada.nextDouble();   
            importe = p * l;
            im= im + importe;
            if ( i == 1) {
                lp1= l;
            }
            if (factura>1000) {
                fmayor_10000++;
            }
            if (fmax<factura) {
                fmax=factura;
            }
            if (fmin>factura) {
                fmin=factura;
            }
            
            
    }
        System.out.println("RESUMEN DE VENTAS");
        System.out.println("Importe total de facturas capturada: " + im);
        System.out.println("Litros del producto 1: " + lp1);
        System.out.println("Facturas mayores a 10,000: " + fmayor_10000);
        System.out.println("Valor máximo de las facturas: " + fmax);
        System.out.println("Valor mínimo de las facturas: " + fmin);
   } 
}
