/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio43
 */
import java.util.Scanner;
public class T05Ejercicio43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número: ");
    long numero = sc.nextLong();

    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    int posicion = sc.nextInt();

    // Longitud del número

    int longitud = 0;
    long num = numero;

    while (num != 0) {
      num /= 10;
      longitud++;
    }

    // Separación

    long primera = numero / (long) (Math.pow(10, (longitud - posicion + 1)));
    long segunda = numero % (long) (Math.pow(10, (longitud - posicion + 1)));

    System.out.println("Los números partidos son el " + primera + " y el " + segunda + ".");

    sc.close();
  }
}