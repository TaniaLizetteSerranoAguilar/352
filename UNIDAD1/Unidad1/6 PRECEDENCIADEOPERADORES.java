package pkg6.precedenciadeoperadores;
import java.util.Scanner;
public class PRECEDENCIADEOPERADORES {

    public static void main(String[] args) {
       
         calculaOperaciones();
 
    }
    public static void calculaOperaciones(){
        //Declaración de variables 
       double a,b,c,d,e,f,g,h,j,m,n,p,q,r,s,x,y;
       //Entrada de datos
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce valor de a");
       a = entrada.nextInt();
        System.out.println("Introduce valor de b");
       b = entrada.nextInt();
        System.out.println("Introduce valor de c");
       c = entrada.nextInt();
        System.out.println("Introduce valor de d");
       d = entrada.nextInt();
        System.out.println("Introduce valor de e");
       e = entrada.nextInt();
        System.out.println("Introduce valor de f");
       f = entrada.nextInt();
        System.out.println("Introduce valor de g");
       g = entrada.nextInt();
        System.out.println("Introduce valor de h");
       h = entrada.nextInt();
        System.out.println("Introduce valor de j");
       j = entrada.nextInt();
       System.out.println("Introduce valor de m");
       m = entrada.nextInt();
       System.out.println("Introduce valor de n");
       n = entrada.nextInt();
       System.out.println("Introduce valor de p");
       p = entrada.nextInt();
       System.out.println("Introduce valor de q");
       q = entrada.nextInt();
       System.out.println("Introduce valor de r");
       r = entrada.nextInt();
       System.out.println("Introduce valor de s");
       s = entrada.nextInt();
        System.out.println("Introduce valor de x");
       x = entrada.nextInt();
        System.out.println("Introduce valor de y");
       y = entrada.nextInt();
       //OPERACIONES 
        //************ Inciso A 
        double calculaA;
        calculaA = (3/2) + (4/3);
        System.out.println("a)" + calculaA);
        //************ Inciso B
        double calculaB;
        calculaB = (1/ (x-5)) - (3*(x*y))/4;
        System.out.println("b)" + calculaB);
        //************ Inciso C
        double calculaC;
        calculaC = ((1/2)+7);
        System.out.println("c)" + calculaC);
        //************ Inciso D
        double calculaD;
        calculaD = (7+(1/2));
        System.out.println("d)" + calculaD);
        //************ Inciso E
        double calculaE;
        double cuadrado = Math. pow(a, 2);
        calculaE = (a + cuadrado)/(b-c) + (d-e) / (f- ((g*h)/j));
        System.out.println("e)" + calculaE); 
        //************ Inciso F
        double calculaF;
        calculaF = (m/n)+ p;
        System.out.println("f)" + calculaF);
        //************ Inciso G
        double calculaG;
        calculaG = m + (n/(p-q));
        System.out.println("g)" + calculaG);
        //************ Inciso H
        double calculaH;
        double cuadra = Math. pow(b, 2);
        double cuadr = Math. pow(c, 2);
        double cuad = Math. pow(d, 2);
        calculaH = ((a + cuadrado)/(b + cuadra)) + ((c + cuadr)/(d + cuad));
        System.out.println("h)" + calculaH);
        //************ Inciso I
        double calculaI;
        calculaI = ((m+(n/p)) / (q-(r/s)));
        System.out.println("i)" + calculaI);
        //************ Inciso J
        double calculaJ;
        calculaJ = ((3*(a+b)) / (c-((d+(5*e))/(f+(8/(2*h))))));
        System.out.println("j)" + calculaJ);
        //************ Inciso K
        double calculaK;
        double cua = Math. pow(x, 2);
        calculaK = (((a + cuadrado)+(2*a*b)+(b + cuadra))/((1/(x + cua))+2));
        System.out.println("j)" + calculaK);      
        
    }
}