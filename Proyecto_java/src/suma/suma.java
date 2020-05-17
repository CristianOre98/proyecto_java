
package suma;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
    double n1, n2, result;
    
         System.out.println("******* Suma ***********");
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el primer numero");
        n2 = leer.nextDouble();
        
        result = n1 * n2;
        System.out.println("*************************");
        System.out.println("**** resultado de la suma es: "+result);
        System.out.println("*************************");
    }
}
