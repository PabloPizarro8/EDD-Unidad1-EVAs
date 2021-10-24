
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

public class EVA1_11_EJEMPLO_ARREGLOS {
    
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        
        // PEDIR EL TAMAÑO DEL GRUPO
        System.out.print("Indique el tamaño del grupo: ");
        int iTamano = escaner.nextInt();
        
        // LUGAR DONDE GUARDAREMOS LAS EDADES
        // Otra forma de declarar un arreglo es de esta manera
        int aiEdades[] = new int[iTamano];
        
        // INGRESAR TODAS LAS EDADES DEL GRUPO
        // Aqui puedes utilizar como maximo "iTama" o ".length()"
        for (int i = 0; i < aiEdades.length; i++) {
            
            System.out.print("Edad: ");
            aiEdades[i] = escaner.nextInt();
            
        }
        
        // ACUMULAR 
        int iAcum = 0;
        System.out.print("Edades: ");
        for (int i = 0; i < aiEdades.length; i++) {
            
            System.out.print("[" + aiEdades[i] + "]");
            iAcum = iAcum + aiEdades[i];
            // iAcum += aiEdades[i];
        }
        
        // SACAMOS EL PROMEDIO
        double dProm = (double)iAcum / (double)aiEdades.length;
        
        System.out.println("\nPromedio del grupo: " + dProm);
    }
    
}
