/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio44
 */
import java.util.Scanner;
public class T05Ejercicio44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número: ");
    long numero = sc.nextLong();

    System.out.print("Introduzca la posición donde quiere insertar: ");
    int posicion = sc.nextInt();

    System.out.print("Introduzca el digito que quiere insertar: ");
    int digito = sc.nextInt();

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

    System.out.println("El número formado es " + primera + "" + digito + "" + segunda + ".");

    sc.close();
  }
}
