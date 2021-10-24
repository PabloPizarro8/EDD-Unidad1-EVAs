
package eva1_10_lenght;

public class EVA1_10_LENGHT {
    
    
    public static void main(String[] args) {
        
        int[] aiDatos = new int[100];
        System.out.println("Tamaño del arreglo: " + aiDatos.length);
        
        System.out.println("Imprimiendo el arreglo: " + aiDatos);
        
        for (int i = 0; i < aiDatos.length; i++) {
            
            aiDatos[i] = (int) (Math.random() * 100);
            
        }
        
        System.out.println("Volviendo a imprimir el arreglo: " + aiDatos);
        
        for (int i = 0; i < aiDatos.length; i++) {
            
            System.out.print("[" + aiDatos[i] + "]");
            
        }
        
    }
    
}
