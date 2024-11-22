/* Realizar un programa Java que permita pedir por teclado el nombre de 5 
empleados. Por cada empleado se debe solicitar el nombre, numero de días 
trabajados y costo del día trabajo. Calcular el valor a cancelar por la empresa 
para cada empleado. Presentar un reporte como el siguiente:
Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Problema3_Empleados {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int dia, cont = 1;
        double costoDia, costoT;

        while (cont <= 5) {
            System.out.print("Dame el nombre del trabajador " + cont + ", el numero de dias trabajados y el costo por dia: ");
            nombre = tcl.next();
            dia = tcl.nextInt();
            costoDia = tcl.nextDouble();
            costoT = dia * costoDia;

            System.out.printf("| %s | %s | %s | %s | %n", "NOMBRE", "DIAS", "COSTO DIA", "COSTO TOTAL");
            System.out.printf("| %s | %d | %.2f | %.2f | %n", nombre, dia, costoDia, costoT);
            cont++;

        }

    }

}
/* run:
Dame el nombre del trabajador 1, el numero de dias trabajados y el costo por dia: Jorge 10 2
| NOMBRE | DIAS | COSTO DIA | COSTO TOTAL | 
| Jorge | 10 | 2,00 | 20,00 | 
Dame el nombre del trabajador 2, el numero de dias trabajados y el costo por dia: pepe 7 8
| NOMBRE | DIAS | COSTO DIA | COSTO TOTAL | 
| pepe | 7 | 8,00 | 56,00 | 
Dame el nombre del trabajador 3, el numero de dias trabajados y el costo por dia: pepe 8 7
| NOMBRE | DIAS | COSTO DIA | COSTO TOTAL | 
| pepe | 8 | 7,00 | 56,00 | 
Dame el nombre del trabajador 4, el numero de dias trabajados y el costo por dia: pepe 9 8
| NOMBRE | DIAS | COSTO DIA | COSTO TOTAL | 
| pepe | 9 | 8,00 | 72,00 | 
Dame el nombre del trabajador 5, el numero de dias trabajados y el costo por dia: pepe 5 4
| NOMBRE | DIAS | COSTO DIA | COSTO TOTAL | 
| pepe | 5 | 4,00 | 20,00 | 
BUILD SUCCESSFUL (total time: 32 seconds)
*/
