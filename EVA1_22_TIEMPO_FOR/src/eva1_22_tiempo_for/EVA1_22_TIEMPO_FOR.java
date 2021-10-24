
package eva1_22_tiempo_for;

public class EVA1_22_TIEMPO_FOR {
    
    public static void main(String[] args) {
        
        // Tamano maximo de un arreglo, es de 2,147,483,647
        // int[] aiArray = new int[Integer.MAX_VALUE]; // Esto en memoria ocupa mucho
        // Si no se tiene suficiente memoria RAM, pues te petara
        
        // Algo mas manejable 
        int[] aiArray = new int[100000000];
        
        for (int i = 0; i < aiArray.length; i++) {
            
            aiArray[i] = 100;
            
        }
        
    }
    
}
