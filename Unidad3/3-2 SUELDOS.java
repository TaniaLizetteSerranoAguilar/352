package pkg3.pkg2.sueldos;
import java.util.Scanner;
public class SUELDOS {

    
    public static void main(String[] args) {
        int sueldos, smayor_1000 = 0,suma_sueldos = 0,ps = 0,smax = 0,smin = 0;
        Scanner entrada = new Scanner (System.in);
        for (int i=1; i<=10; i++){
            System.out.println("Introduzca sueldo " + i);
            sueldos=entrada.nextInt();
            if (sueldos>1000) {
                smayor_1000++;
            }
            if (smax<sueldos) {
                smax=sueldos;
            }
            if (smin>sueldos) {
                smin=sueldos;
            }
            suma_sueldos = suma_sueldos + sueldos;
            ps= suma_sueldos / 10;
            
        }
        System.out.println("Suma de sueldos: " + suma_sueldos);
        System.out.println("Sueldos mayores a 1000: " + smayor_1000);
        System.out.println("Promedio de sueldos: " + ps);
        System.out.println("Sueldo máximo: " + smax);
        System.out.println("Sueldo mínimo: " + smin);
    }
    
}
