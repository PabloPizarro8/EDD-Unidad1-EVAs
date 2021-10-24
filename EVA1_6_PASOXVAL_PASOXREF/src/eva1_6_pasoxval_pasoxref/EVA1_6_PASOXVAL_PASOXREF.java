
package eva1_6_pasoxval_pasoxref;

public class EVA1_6_PASOXVAL_PASOXREF {

    public static void main(String[] args) {
        
        int valOrig = 5;
        
        System.out.println("ValOrig en el main = " + valOrig);
        incrementa(valOrig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);
        
        valOrig = incrementaFuncional(valOrig);
        System.out.println("ValOrig que si incrementa = " + valOrig);
        
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba.x);
        System.out.println("Objeto iniciial = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de x despues de incrementa = " + objPrueba.x);
    }
    // PASO POR VALOR -> Pasamos una copia del valor en una variable (Variables locales primitivas)
    public static void incrementa(int val){
        val ++ ;
    }
    
    public static int incrementaFuncional (int val){
        val++;
        return val;
    }
    // PASO POR REFERENCIA -> Pasan la direccion en memoria del objeto (Objeto)
    public static void incrementaObj(Prueba val){
        System.out.println("Objeto en incrementa = " + val);
        val.x++;
    }
    
    
}

class Prueba{
    
    public int x = 10;
    
}