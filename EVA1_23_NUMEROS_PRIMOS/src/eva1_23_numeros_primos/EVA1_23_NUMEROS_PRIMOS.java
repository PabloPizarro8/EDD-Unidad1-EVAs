
package eva1_23_numeros_primos;

import java.util.Scanner;

public class EVA1_23_NUMEROS_PRIMOS {
    
    public static void main(String[] args) {
        
        String SerPrimo = "es primo"; // Se guardara si es primo o no
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int iVal = input.nextInt();
        /*
        for (int i = 2; i < iVal; i++) {
            // DIVISION iVal / i
            // Si la division es exacta --> terminamos: NO ES PRIMO
            // Si terminamos el for sin division exacta: ES PRIMO
            
            double dMod = (double) iVal % (double)i; // Hacemos una division con el modulo,
            // saber si el numero da una division exacta
            if (dMod == 0) {
                SerPrimo = "no es primo";
                break;
            }
        }
        */
        
        for (int i = 2; i < Math.sqrt(iVal); i++) {
            double dMod = (double)iVal % (double)i;
            if (dMod == 0) {
                SerPrimo = "no es primo";
                break;
            }
        }
        System.out.println("El valor " + iVal + " " + SerPrimo);
        // Imprimir si es primo o no
        
    }
    
}
