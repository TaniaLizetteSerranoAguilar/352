package pkg2.pkg6.for_tablas;


public class FOR_TABLAS {

  
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=10; i++){
            System.out.println("Tabla del " + i);
            System.out.println("---------------");
            
            for(j=1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + j*i);
            }
        }
    }
    
}
