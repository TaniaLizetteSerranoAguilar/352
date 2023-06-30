package pkg2.pkg5.while_for_do;

public class WHILE_FOR_DO {
    
    public static void main(String[] args) {
        //***************************************
        System.out.println("Númerosde 1 al 100 con while");
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
        //***************************************
        int j=1;
        System.out.println("Númerosde 1 al 100 con Do"); 
        do{
           System.out.println(j); 
           j++;
        } while (j<=100);
        //***************************************
        System.out.println("Númerosde 1 al 100 con For");
        for (int k=1; k<=100; k++){
            System.out.println(k);
        }
    }
    
}
