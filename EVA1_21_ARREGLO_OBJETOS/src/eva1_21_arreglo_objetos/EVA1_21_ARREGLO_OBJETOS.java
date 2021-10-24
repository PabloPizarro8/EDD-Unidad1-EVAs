
package eva1_21_arreglo_objetos;

import java.util.Scanner;

public class EVA1_21_ARREGLO_OBJETOS {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        persona objPersona[] = new persona[10];
        
        for (int i = 0; i < objPersona.length; i++) {
            
            objPersona[i] = new persona();
            System.out.print("Introduce un nombre: ");
            String nombre = input.nextLine();
            objPersona[i].setStrNombre(nombre);
        }
        
        System.out.print("Nombres: ");
        for (int i = 0; i < objPersona.length; i++) {
            
            System.out.print("[" + objPersona[i].getStrNombre() + "]");
            
        }
        
    }
    
}
class persona{
    private String strNombre;

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrNombre() {
        return strNombre;
    }
    
}