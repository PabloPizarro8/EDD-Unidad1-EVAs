
package eva1_12_arreglos;

public class EVA1_12_ARREGLOS {

    public static void main(String[] args) {
        int[] iArreglo = new int[3];
        
        System.out.println("Direccion de iArreglo: " + iArreglo);
        
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        // iArreglo[3] = 3; // Error: ArrayIndexOutOfBound --> Nos pasamos de los limites del array
        
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA " + i + " = $" + iArreglo[i]);
            
        }
        
        // Modificamos el arreglo, reduciendo su direccion
        iArreglo = new int[2];
        System.out.println("Direccion de iArreglo modificada: " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA " + i + " = $" + iArreglo[i]);
            // Output: Nos reseteo las cuentas
        }
        
    }
    
}
