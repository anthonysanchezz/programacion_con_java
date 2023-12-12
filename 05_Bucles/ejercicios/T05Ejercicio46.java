/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio46
 */
import java.util.Scanner;
public class T05Ejercicio46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor introduzca la anchura de su rectángulo (como mínimo 2): ");
    int ancho = sc.nextInt();

    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int alto = sc.nextInt();

    if (ancho < 2 || alto < 2) {
      System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
    } else {
      for (int i = 1; i <= ancho; i++) {
        System.out.print("* ");
      }
      System.out.println("");
      for (int i = 1; i <= (alto - 2); i++) {
        System.out.print("* ");
        for (int j = 1; j <= (ancho - 2); j++) {
          System.out.print("  ");
        }
        System.out.print("*\n");
      }
      for (int i = 1; i <= ancho; i++) {
        System.out.print("* ");
      }
    }

    sc.close();
  }
}