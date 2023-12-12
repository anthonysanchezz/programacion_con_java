/**
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio45
 */
import java.util.Scanner;
public class T05Ejercicio45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero = sc.nextLong();

    System.out.print("Introduzca la posición dentro del número: ");
    int posicion = sc.nextInt();

    System.out.print("Introduzca el nuevo dígito: ");
    int digito = sc.nextInt();

    int longitud = 0;
    long num = numero;

    while (numero != 0) {
      numero /= 10;
      longitud++;
    }

    long primera = num / (long) (Math.pow(10, (longitud - posicion + 1)));
    long segunda = num % (long) (Math.pow(10, (longitud - posicion)));

    System.out.println("El número resultante es " + primera + "" + digito + "" + segunda);

    sc.close();
  }
}