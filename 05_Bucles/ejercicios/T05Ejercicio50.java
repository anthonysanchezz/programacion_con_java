/**
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio50
 */
import java.util.Scanner;
public class T05Ejercicio50 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura (5 como mínimo): ");
    int altura = sc.nextInt();

    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacios = sc.nextInt();

    if (altura < 5 || espacios < 2) {
      System.out.println("Incorrecto!");
    } else {
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("****");
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("*   ");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("*   ");
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("****");
      for (int i = 1; i < altura - 3; i++) {
        System.out.print("*");
        for (int j = 0; j < espacios; j++) {
          System.out.print(" ");
        }
        System.out.print("   *");
        for (int j = 0; j < espacios; j++) {
          System.out.print(" ");
        }
        System.out.println("   *");
      }
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("****");
    }

    sc.close();
  }
}