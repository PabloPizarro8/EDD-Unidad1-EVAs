
package eva1_4_heap;

public class EVA1_4_HEAP {
    
    public static void main(String[] args) {
        
        MiClase objClase = new MiClase();
        
        // Imprimimos lo que hay en el string dentreo de la clase
        System.out.println(objClase.getMensaje());
        // Imprimimos la direccion de memoria del objeto 
        System.out.println(objClase);
        
        MiClase objClase1 = new MiClase();
        System.out.println(objClase1);
        
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        // Imprimimos la referencia al ofjeto en heap
        System.out.println(objHeap);
        
        
    }
    
}

class MiClase{
    private String mensaje;
    public MiClase(){
        mensaje = "Hola mundo";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
