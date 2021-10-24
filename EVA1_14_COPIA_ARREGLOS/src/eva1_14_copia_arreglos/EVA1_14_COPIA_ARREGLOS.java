
package eva1_14_copia_arreglos;

public class EVA1_14_COPIA_ARREGLOS {
    
    public static void main(String[] args) {
        
        int[] iArreglo = new int[3];
        
        System.out.println("Direccion de iArreglo: " + iArreglo);
        
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA (iArreglo)" + i + " = $" + iArreglo[i]);
            
        }
        // Quiero una copia de los datos del arreglo
        // int[] iCopia = iArreglo; // Esto solo es una copia de la llave del hotel
        int iCopia[] = new int[3];
        System.out.println("Direccion de iCopia = " + iCopia);
        
        for (int i = 0; i < iCopia.length; i++) {
            
            iCopia[i] = iArreglo[i];
            
        }
        
        iCopia[0] = 100000;
        for (int i = 0; i < iCopia.length; i++) {
            
            System.out.println("CUENTA (iCopia)" + i + " = $" + iCopia[i]);
            
        }
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA (iArreglo)" + i + " = $" + iArreglo[i]);
            
        }
        
    }
    
}
