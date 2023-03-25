/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproyect.secciónb;

/**
 *
 * @author magdabardales
 */
public class ATM {
    /* De composicion 
    RanuraParaDepositos ranuraParaDepositosObj = new RanuraParaDepositos();
    TecladoNumerico tecladonumericoObj = new TecladoNumerico();
    Pantalla pantallaObj = new Pantalla();
    Dispensador dispensadorObj = new Dispensador();
    */
    private RanuraParaDepositos ranuraParaDepositosObj; 
    private TecladoNumerico tecladonumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    
    //Implementación 
    public ATM() { //Asociacion 
        this.ranuraParaDepositosObj = new RanuraParaDepositos();
        this.tecladonumericoObj = new TecladoNumerico();//Asociacion  
        this.pantallaObj = new Pantalla();
        this.dispensadorObj = new Dispensador();   

        this.solicitarDatos();
    }
    //Ejemplo    
    /*public void polimorfismo(Transaccion trans){
        trans.ejecutar(0);
    }*/
    private void solicitarDatos() {
        pantallaObj.mostrarMensaje("Bienvenida!\n");
        pantallaObj.mostrarMensaje("Ingrese su numero de cuenta: ");
        //Toma el valor capturar datos
        
        int numeroCuenta = tecladonumericoObj.capturarDatos();
        //System.out.println("El numero de cuenta es: " + numeroCuenta);
        pantallaObj.mostrarMensaje("Ingrese su NIP: ");
        int NIP = tecladonumericoObj.capturarDatos();
        
        pantallaObj.mostrarMensaje("\n");//Espacio en blanco
        pantallaObj.mostrarMensaje("Menu Principal\n");
        pantallaObj.mostrarMensaje("1- Ver mi saldo\n");
        pantallaObj.mostrarMensaje("2- Retirar efectivo\n");
        pantallaObj.mostrarMensaje("3- Depositar fondos\n");
        pantallaObj.mostrarMensaje("4- Salir\n");
        pantallaObj.mostrarMensaje("Escriba una opción: ");
        int opcion = tecladonumericoObj.capturarDatos();
        
        //Declaramos las variables con los valores de las opciones del menú principal
        int consultarSaldo = 1;
        int retiro = 2;
        int Deposito = 3;
        int Salir = 4;
        
        pantallaObj.mostrarMensaje("\n");//Espacio en blanco
        pantallaObj.mostrarMensaje("Menu de retiro\n");
        pantallaObj.mostrarMensaje("1- $20         4- $100\n");
        pantallaObj.mostrarMensaje("2- $40         5- $200\n");
        pantallaObj.mostrarMensaje("3- $60         6- Cancelar transaccion\n");
        pantallaObj.mostrarMensaje("Elija un monto de retiro: ");
        int montoRetiro = tecladonumericoObj.capturarDatos();
        
        pantallaObj.mostrarMensaje("Tome el efectivo");
        
        //Declaramos las variables con los valores de las opciones del menú Retiro
        int Opc1 = 1;
        int Opc2 = 2;
        int Opc3 = 3;
        int Opc4 = 4;
        int Opc5 = 5;
        int Opc6 = 6;
        
        pantallaObj.mostrarMensaje("\n");//Espacio en blanco
        pantallaObj.mostrarMensaje("Menu de deposito\n");
        pantallaObj.mostrarMensaje("Introduzca 0 para cancelar la transaccion\n");
        pantallaObj.mostrarMensaje("Introduzca un monto de depósito: ");
        int montoDeposito = tecladonumericoObj.capturarDatos();
        
        int cancel = 0;
        
        
    }
    
    //private Autenticar(){
        
    
}
