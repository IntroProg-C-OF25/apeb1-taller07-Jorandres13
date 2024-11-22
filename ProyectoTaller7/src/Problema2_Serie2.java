
/* Realizar un programa Java que permita presentar en pantalla la siguiente 
secuencia: 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 5, limite, contador2 = 5;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt();
        while (contador <= (limite * 5)) {
            System.out.print(contador + "/" + (contador2 + 5) + ", ");
            contador = contador + 5;
            contador2 = contador2 + 2;
        }
        System.out.println("");

    }

}
/*Dame el limite: 10
5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24, 45/26, 50/28, 
BUILD SUCCESSFUL (total time: 4 seconds)
 */
