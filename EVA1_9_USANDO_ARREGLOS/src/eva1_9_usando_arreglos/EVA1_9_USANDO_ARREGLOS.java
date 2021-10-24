
package eva1_9_usando_arreglos;

public class EVA1_9_USANDO_ARREGLOS {
    
    public static void main(String[] args) {
        
        // 1. Un arreglo de enteros
        
        int[] aiDatos = new int[10];
        
        // 2. LLenar con valores
        
        /*
            Indice:
        
                Primer elemento del arreglo: posicion 0
                Ultimo elemento del arreglo: posicion N - 1 (N es el tamaño del arreglo)
        
        */
        
        for (int i = 0; i < aiDatos.length; i++) {
            
            aiDatos[i] = (int) (Math.random() * 100); // Random -- > valores entre 0 y 1
                    // Pero multiplicados por 100 para volverlos entre 0 y 100
                    // Y despues convertidos a entero mediante un casteo ("(int)")
            System.out.print("[" + aiDatos[i] + "]");
            
            
        }
        // 3. Imprimir los valores
        
    }
    
}
