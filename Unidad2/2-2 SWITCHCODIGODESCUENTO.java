package pkg2.pkg2.switchcodigodescuento;
import java.util.Scanner;
 class SWITCHCODIGODESCUENTO {
     
    public static void main(String[] args) {
        //DEFINICIÓN DE VARIABLES 
        double PV = 1000;
        Scanner entrada = new Scanner (System.in);
        int descuento = 0;
        double precioFinal;
        String codPromocion;
        //ENTRADA DE DATOS
        System.out.println("Su total de compre es: " + PV);
        System.out.println("Tienes un código de descuento escribalo: ");
        codPromocion = entrada.next();
        //toUpperCase para que convierta a mayusculas 
        codPromocion = codPromocion.toUpperCase();
        //PROCESO
        //SALIDA DE DATOS
        switch (codPromocion){
            case "PLATINOOCTUBRE":
                    descuento = 20;
                    break;
            case "SILVEROCTUBRE":
                    descuento = 50;
                    break;
            case "BRONCEOCTUBRE":
                    descuento = 35;
                    break;
            case "OROOCTUBRE":
                descuento = 75;
                    break;
            default:
                    System.out.println("Ha introducido un código no aceptado");    
        }
        precioFinal = PV - descuento;
        System.out.println("Total sobre descuento es: $" + precioFinal);
    }
    
}
