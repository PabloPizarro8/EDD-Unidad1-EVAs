/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_de_arreglos;

/**
 *
 * @author zotzo
 */
public class EVA1_16_ARREGLOS_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // dECLARAR UN ARREGLO DE DOS DIMENSIONES:
        int[][] iMatriz = new int[3][3];
        System.out.println("Direccion de la matriz: " + iMatriz);
        
        for (int i = 0; i < iMatriz.length; i++) {
            
            System.out.println("iMatriz[" + i + "]" + iMatriz[i]);
            
        }
        
    }
    
}
