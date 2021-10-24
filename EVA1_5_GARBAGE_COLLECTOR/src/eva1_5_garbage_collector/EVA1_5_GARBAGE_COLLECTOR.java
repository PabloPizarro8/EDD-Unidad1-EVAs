
package eva1_5_garbage_collector;

public class EVA1_5_GARBAGE_COLLECTOR {
    
    public static void main(String[] args) {
        
        MiClase objClase = new MiClase();
        System.out.println(objClase);
        
        // Eliminamos el objeto
        objClase = null;
        System.out.println(objClase);
        
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
