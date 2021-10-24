/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_objetos;

/**
 *
 * @author zotzo
 */
public class EVA1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba objPrueba = new Prueba();
        System.out.println(objPrueba);
        
        Prueba objPrueba1 = objPrueba;
        System.out.println(objPrueba1);
        
        System.out.println("Valor de x = " + objPrueba.x);
        objPrueba1.x++;
        System.out.println("Valor de x = " + objPrueba.x);
    }
    
}

class Prueba{
    int x = 10;
}