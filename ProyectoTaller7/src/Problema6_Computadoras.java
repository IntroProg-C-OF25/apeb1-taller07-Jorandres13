/*
Una empresa de comercialización de computadoras realiza el proceso de venta 
haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento 
del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo 
de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: 
por cada venta preguntar los siguiente datos:

Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra 
computadora con precio $100
@author Jorge Guerrero
 */

import java.util.Scanner;

public class Problema6_Computadoras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String cliente;
        double costo;
        int contador = 1;
        while (contador <= 7) {
            System.out.print("Ingrese el nombre del cliente y el costo de la computadora: ");
            cliente = tcl.next();
            costo = tcl.nextDouble();
            if (costo <= 100) {
                System.out.println("Cliente tipo1, descuento del 10% ");
                costo = costo * 0.9;
            } else {
                System.out.println("Cliente tipo2, descuento del 20% ");
                costo = costo * 0.8;
            }
            contador++;
            System.out.printf("| %s | %s |\n", "NOMBRE", "COSTO");
            System.out.printf("| %s | %.2f |\n", cliente, costo);
        }
    }
}
/*
run:
Ingrese el nombre del cliente y el costo de la computadora: Jorge 100
Cliente tipo1, descuento del 10% 
| NOMBRE | COSTO |
| Jorge | 90,00 |
Ingrese el nombre del cliente y el costo de la computadora: Pepe 56
Cliente tipo1, descuento del 10% 
| NOMBRE | COSTO |
| Pepe | 50,40 |
Ingrese el nombre del cliente y el costo de la computadora: Ricky 230
Cliente tipo2, descuento del 20% 
| NOMBRE | COSTO |
| Ricky | 184,00 |
Ingrese el nombre del cliente y el costo de la computadora: Andres 123
Cliente tipo2, descuento del 20% 
| NOMBRE | COSTO |
| Andres | 98,40 |
Ingrese el nombre del cliente y el costo de la computadora: Daniela 120
Cliente tipo2, descuento del 20% 
| NOMBRE | COSTO |
| Daniela | 96,00 |
Ingrese el nombre del cliente y el costo de la computadora: Daniel 230
Cliente tipo2, descuento del 20% 
| NOMBRE | COSTO |
| Daniel | 184,00 |
Ingrese el nombre del cliente y el costo de la computadora: Gabriel 120
Cliente tipo2, descuento del 20% 
| NOMBRE | COSTO |
| Gabriel | 96,00 |
 */
