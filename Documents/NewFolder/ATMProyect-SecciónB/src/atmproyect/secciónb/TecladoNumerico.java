/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproyect.secciónb;

import java.util.Scanner;

/**
 *
 * @author magdabardales
 */
public class TecladoNumerico {
    //capturar datos
    private Scanner scan;
    
    public TecladoNumerico() {
        scan = new Scanner(System.in);
    }
    
    public int capturarDatos(){
        //capturar dato y convertirlo a entero, capturar el dato desde el lugar donde se invoca
        return scan.nextInt();       
    }
}
