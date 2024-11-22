/*Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
@author Jorge Guerrero
 */

import java.util.Scanner;

public class Problema4_Futbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posicion;
        int edad = 0, cont = 1, numeroJugadores;
        double estatura = 0, promEdad = 0, promEstatura = 0, sumaEdad = 0, sumaEstatura = 0;
        System.out.print("Cuantos jugadores vas a ingresar?: ");
        numeroJugadores = tcl.nextInt();

        while (cont <= numeroJugadores) {
            System.out.print("Ingrese el nombre del jugador " + cont + ", posicion, edad y altura: ");
            nombre = tcl.next();
            posicion = tcl.next();
            edad = tcl.nextInt();
            estatura = tcl.nextDouble();
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
            System.out.printf("| %s | %s | %s | %s |%n", "NOMBRE", "POSICION", "EDAD", "ESTATURA");
            System.out.printf("| %s | %s | %d | %.2f |%n", nombre, posicion, edad, estatura);
            cont++;
        }
        promEdad = sumaEdad / numeroJugadores;
        promEstatura = sumaEstatura / numeroJugadores;

        System.out.printf("| %s | %s |%n", "PROMEDIO EDAD", "PROMEDIO ESTATURA");
        System.out.printf("| %.2f | %.2f |%n", promEdad, promEstatura);

    }
}
/* run:
Cuantos jugadores vas a ingresar?: 2
Ingrese el nombre del jugador 1, posicion, edad y altura: Hincapie defensa 25 1,5
| NOMBRE | POSICION | EDAD | ESTATURA |
| Hincapie | defensa | 25 | 1,50 |
Ingrese el nombre del jugador 2, posicion, edad y altura: Hincapie defensa 25 1,5
| NOMBRE | POSICION | EDAD | ESTATURA |
| Hincapie | defensa | 25 | 1,50 |
| PROMEDIO EDAD | PROMEDIO ESTATURA |
| 25,00 | 1,50 |
BUILD SUCCESSFUL (total time: 6 seconds)
 */
