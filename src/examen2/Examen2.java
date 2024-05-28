/*
 * Realiza un programa que simule un cajero automático, el cual realizará 3 operaciones (consulta de saldo, 
 * Transacciones y Retiro de efectivo), cada termine de realizar una operación debe
 * preguntar al usuario si desea hacer otra operación, en caso de que el usuario diga que no, 
 * el programa termina, en caso de que el usuario indique que si, regresara al menú principal.
 * Otra cosa que se debe de considerar es que al ingresar el NIP erróneamente en tres ocasiones, 
 * se cancelará la tarjeta.
 */
package examen2;
/**
 *
 * @author Ruben Aellano Correa
 */
public class Examen2 {

   
    public static void main(String[] args) {
        Exa call = new Exa();
    call.Desiciones();
        System.out.println("\t\n*****GRACIAS POR SU VISITA VUELVA PRONTO*****");
    }
    
}
