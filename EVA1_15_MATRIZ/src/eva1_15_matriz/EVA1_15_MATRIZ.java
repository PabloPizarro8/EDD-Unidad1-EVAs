
package eva1_15_matriz;

public class EVA1_15_MATRIZ {
    
    
    public static void main(String[] args) {
        // Crear un arreglo de dos dimensiones; 5 filas x 3 columnas 
        int iaMatriz[][] = new int[5][3];
        
        iaMatriz[0][0] = 1000; // PRIMER POSICION
        iaMatriz[4][2] = 2000; // ULTIMA POSICION
        
        for (int i = 0; i < iaMatriz.length; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                iaMatriz[i][j] = 2000;
                
            }
            
        }
        for (int i = 0; i < iaMatriz.length; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("[" + iaMatriz[i][j] + "]");
                
            }
            
            System.out.println("");
        }
    }
    
}
