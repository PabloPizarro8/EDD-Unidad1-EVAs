
package eva1_19_cubo;

public class EVA1_19_CUBO {
    
    public static void main(String[] args) {
        
        int[][][] aiCubo = new int [3][4][2];
        
        
        for (int i = 0; i < aiCubo.length; i++) {
            for (int j = 0; j < aiCubo[i].length; j++) {
                for (int k = 0; k < aiCubo[i][j].length; k++) {
                    aiCubo[i][j][k] = 1 + i + j + k;
                }
            }
        }
        for (int i = 0; i < aiCubo.length; i++) {
            for (int j = 0; j < aiCubo[i].length; j++) {
                for (int k = 0; k < aiCubo[i][j].length; k++) {
                    System.out.print("[" + aiCubo[i][j][k] +"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
    
}
