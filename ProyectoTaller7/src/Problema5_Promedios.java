/*Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
ellos ingresar el nombre del estudiante, el promedio de ciclo. 
Presentar el siguiente reporte 
@author Jorge Guerrero
 */

import java.util.Scanner;

public class Problema5_Promedios {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("Dame el nombre y el promedio DEL EST_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio >= 7) {
                estado = ("Aprobado");
            } else {
                estado = ("Reprobado");
            }
            System.out.printf("| %s | %s | %s | %n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s | %.2f | %s | %n", nombre, promedio, estado);

            contador++;
        }

    }

}
/* run:
Dame el nombre y el promedio DEL EST_1: Jorge 7
| NOMBRE | PROMEDIO | ESTADO | 
| Jorge | 7,00 | Aprobado | 
Dame el nombre y el promedio DEL EST_2: Pepito 8
| NOMBRE | PROMEDIO | ESTADO | 
| Pepito | 8,00 | Aprobado | 
Dame el nombre y el promedio DEL EST_3: Daniela 1
| NOMBRE | PROMEDIO | ESTADO | 
| Daniela | 1,00 | Reprobado | 
Dame el nombre y el promedio DEL EST_4: Rciky 9
| NOMBRE | PROMEDIO | ESTADO | 
| Rciky | 9,00 | Aprobado | 
BUILD SUCCESSFUL (total time: 52 seconds)
*/