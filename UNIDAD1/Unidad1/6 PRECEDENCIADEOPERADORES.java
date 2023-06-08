package pkg6.precedenciadeoperadores;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PRECEDENCIADEOPERADORES {
 
    static double a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,m=0,n=0,p=0,q=0,r=0,s=0,x=0,y=0;
    
    public static void main(String[] args) {
       pedirDatos();
        calculaOperaciones(a,b,c,d,e,f,g,h,j,m,n,p,q,r,s,x,y);
 
    }
    public static void pedirDatos(){
       Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce valor de a");
       a = entrada.nextDouble();
        System.out.println("Introduce valor de b");
       b = entrada.nextDouble();
        System.out.println("Introduce valor de c");
       c = entrada.nextDouble();
        System.out.println("Introduce valor de d");
       d = entrada.nextDouble();
        System.out.println("Introduce valor de e");
       e = entrada.nextDouble();
        System.out.println("Introduce valor de f");
       f = entrada.nextDouble();
        System.out.println("Introduce valor de g");
       g = entrada.nextDouble();
        System.out.println("Introduce valor de h");
       h = entrada.nextDouble();
        System.out.println("Introduce valor de j");
       j = entrada.nextDouble();
       System.out.println("Introduce valor de m");
       m = entrada.nextDouble();
       System.out.println("Introduce valor de n");
       n = entrada.nextDouble();
       System.out.println("Introduce valor de p");
       p = entrada.nextDouble();
       System.out.println("Introduce valor de q");
       q = entrada.nextDouble();
       System.out.println("Introduce valor de r");
       r = entrada.nextDouble();
       System.out.println("Introduce valor de s");
       s = entrada.nextDouble();
        System.out.println("Introduce valor de x");
       x = entrada.nextDouble();
        System.out.println("Introduce valor de y");
       y = entrada.nextDouble();
    }
    public static void calculaOperaciones(double a,double b,double c,double d,double e,
            double f,double g,double h, double j,double m,double n,double p,double q,double r,
            double s, double x,double y){
        DecimalFormat df = new DecimalFormat("#.00");
       //OPERACIONES 
        //************ Inciso A 
        double calculaA;
        calculaA = (3/2) + (4/3);
        System.out.println("a)" + df.format (calculaA));
        //************ Inciso B
        double calculaB;
        calculaB = (1/ (x-5)) - (3*(x*y))/4;
        System.out.println("b)" + df.format (calculaB));
        //************ Inciso C
        double calculaC;
        calculaC = ((1/2)+7);
        System.out.println("c)" + df.format (calculaC));
        //************ Inciso D
        double calculaD;
        calculaD = (7+(1/2));
        System.out.println("d)" + df.format (calculaD));
        //************ Inciso E
        double calculaE;
        double cuadrado = Math. pow(a, 2);
        calculaE = ((a*a)/(b-c)) + (((d-e) / (f - ((g*h)/j))));
        System.out.println("e)" + df.format (calculaE)); 
        //************ Inciso F
        double calculaF;
        calculaF = (m/n)+ p;
        System.out.println("f)" + df.format (calculaF));
        //************ Inciso G
        double calculaG;
        calculaG = m + (n/(p-q));
        System.out.println("g)" + df.format (calculaG));
        //************ Inciso H
        double calculaH;
        double cuadra = Math. pow(b, 2);
        double cuadr = Math. pow(c, 2);
        double cuad = Math. pow(d, 2);
        calculaH = ((a + cuadrado)/(b + cuadra)) + ((c + cuadr)/(d + cuad));
        System.out.println("h)" + df.format (calculaH));
        //************ Inciso I
        double calculaI;
        calculaI = (m + (n/p)/ q - (r/s));
        System.out.println("i)" + df.format (calculaI));
        //************ Inciso J
        double calculaJ;
        calculaJ = (((3*a) + b)) / (c - ((d + (5*e))/(f + (g/ (2*h)))));
        System.out.println("j)" + df.format (calculaJ));
        //************ Inciso K
        double calculaK;
        calculaK = ((a*a)+(2*(a*b))+(b*b))/((1/(x*x))+2);
        System.out.println("k)" + df.format (calculaK));      
        
    }
}