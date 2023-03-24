/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproyect.secciónb;

/**
 *
 * @author magdabardales
 */
public class ATMProyectSecciónB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Public y private modificador de acceso
        //El modificar Public de acceso configuran la visibilidad de la clase
        //Private Solo son accesibles dentro de la clase
        // TODO code application logic here
        
            //Creacion de objetos, ()Constructor 3er caracteristica es que no tiene retorno ()Sirve para dar entrada al contructor
    /*Cuenta cuentaObj = new Cuenta("----"); 
    Cuenta cuentaObj2 = new Cuenta("----");*/
    //Metodo Especial Getters Setters Getter: sirven para obtener el valor de una variable Setter: Caracteristica a una clase
    
    //cuentaObj.numeroDeCuenta = 1;
    //cuentaObj.setNumeroDeCuenta(1);
    //cuentaObj.getNumeroDeCuenta();
    //cuentaObj2.numeroDeCuenta = 2;
    
    //TecladoNumerico tecladoNumerico = new TecladoNumerico();
    //ATM atmobj = new ATM(tecladoNumerico);//Solo para ejemplicar creamos el objeto Agregacion 
   /* Retiro retiroObj = new Retiro();
    retiroObj.ejecutar(0);
    
    //new crear nuevo objeto
    Deposito depositoObj = new Deposito();
    //escribir nombre de la variable y utilizamos el operador punto(invocar ejecutar) 
    depositoObj.ejecutar(0);*/
    
    //Ejemplo de polimorfismo(Permitido gracias a la relacion de herencia) 
    //2 variables del mismo tipo, al momento de invocar se comportan diferente
    /*Transaccion transaccionObj1 = new Deposito();
    transaccionObj1.ejecutar(0);
   
    Transaccion transaccionObj2 = new Retiro(); 
    transaccionObj2.ejecutar(0);
    
    Cuenta obj = new Cuenta("");
    obj.obtenerSaldo(0);*/
    //obj.obtenerSaldo("", 0);
    //obj.obtenerSaldo(0,"");
    //Transaccion tansaccionObj = new Transaccion();
    //transaccionObj.ejecutar(0);
    
    //arreglo primitivo tiene que tener el mismo tipo 
    //int [] arr1 = new int [2];
    
    //Gracias al polimorfismo se puede asignar otro tipo 
    /*Transaccion [] arr2 = new Transaccion[2];
    arr2 [0] = new Retiro();
    arr2 [1] = new Deposito();
    
    arr2[0].ejecutar(0);
    arr2[1].ejecutar(0);*/
    
    /*ATM atm = new ATM();
    atm.polimorfismo(new Retiro());
    atm.polimorfismo(new Retiro());
    
    Pantalla pantallaObj = new Pantalla();
    pantallaObj.mostrarMensaje("Hola mundo");
    */
    ATM atmObj = new ATM();
    
    
    
    }
    


}
