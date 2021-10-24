
package eva1_13_arreglos2;

public class EVA1_13_ARREGLOS2 {
    
    public static void main(String[] args) {
        int[] iArreglo = new int[3];
        
        System.out.println("Direccion de iArreglo: " + iArreglo);
        
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA (iArreglo)" + i + " = $" + iArreglo[i]);
            
        }
        
        // Creamos un nuevo arreglo con la misma dimension que iArreglo
        int[] iCopia = iArreglo;
        System.out.println("Direccion de iCopia: " + iCopia);
        
        for (int i = 0; i < iCopia.length; i++) {
            
            System.out.println("CUENTA (iCopia)" + i + " = $" + iCopia[i]);
            
        }
        //Modificamos nuestro arreglo 
        iArreglo = new int[2];
        System.out.println("Direccion de iArreglo modificada: " + iArreglo);
        
        for (int i = 0; i < iArreglo.length; i++) {
            
            System.out.println("CUENTA MODIFICADA" + i + " = $" + iArreglo[i]);
            
        }
        System.out.println("Direccion de iCopia: " + iCopia);
        
        for (int i = 0; i < iCopia.length; i++) {
            
            System.out.println("CUENTA (iCopia)" + i + " = $" + iCopia[i]);
            
        }
        
    }
    
}
