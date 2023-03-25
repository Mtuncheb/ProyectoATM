/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproyect.secciónb;

/**
 *
 * @author magdabardales
 */
public class Retiro extends Transaccion {
    
    //ATRIBUTOS
    private int monto; //Atributo monto a retirar 
    //Hacemos las referencias a los componentes
    private TecladoNumerico teclado; 
    private Dispensador dispensador; 
    
    
    
    public void ejecutar(int monto) {
        System.out.println("Retiro.ejecutar()");
    
    }
}
