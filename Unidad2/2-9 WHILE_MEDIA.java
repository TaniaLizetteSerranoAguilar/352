package pkg2.pkg9.while_media;

import java.util.Scanner;

public class WHILE_MEDIA {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println("Introduzca un número: ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while (num>=0){
            suma+=num;
            elementos++;
            
            System.out.println("Introduzca otro número: ");
            num = entrada.nextInt();    
        }
        
        if(elementos == 0){
              System.out.println("No se puede hacer el promedio");  
            }else {
                media= (float) suma/elementos;
                System.out.println("La media es de: " + media); 
            }
    }
    
}
