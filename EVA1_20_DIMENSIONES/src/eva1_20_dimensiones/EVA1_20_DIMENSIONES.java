
package eva1_20_dimensiones;

public class EVA1_20_DIMENSIONES {
    
    public static void main(String[] args) {
        
        int[][][][] iaTese = new int [5][3][2][6];
        int h = 0;
        // Cuantos enteros almacena? = 180
        for (int i = 0; i < iaTese.length; i++) {
            for (int j = 0; j < iaTese[i].length; j++) {
                for (int k = 0; k < iaTese[i][j].length; k++) {
                    for (int l = 0; l < iaTese[i][j][k].length; l++) {
                        h++;
                        iaTese[i][j][k][l] = h;
                        
                    }
                }
            }
        }
        for (int i = 0; i < iaTese.length; i++) {
            for (int j = 0; j < iaTese[i].length; j++) {
                for (int k = 0; k < iaTese[i][j].length; k++) {
                    for (int l = 0; l < iaTese[i][j][k].length; l++) {
                        System.out.print("[" + iaTese[i][j][k][l] +"]");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
    
}
