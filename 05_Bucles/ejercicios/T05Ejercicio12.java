
/**
 * Escribe un programa que muestre los n primeros términos de la
 * serie de Fibonacci. El primer término de la serie de Fibonacci
 * es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 * introducir por teclado.
 * 
 * @author Antonio Sánchez
 */
/**
 * T01Ejercicio12
 */
import java.util.Scanner;

public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;

    System.out.print("Cuantos terminos de la sucesion de Fibonacci quieres que te de? ");
    t = sc.nextInt();

    switch (t) {
      case 1:
        System.out.println("0");
        break;
      case 2:
        System.out.println("0 1");
        break;
      default:
        System.out.print("0 1");
        int primero = 0;
        int segundo = 1;
        int siguiente = 0;
        while (t > 2) {
          siguiente = primero + segundo;
          primero = segundo;
          segundo = siguiente;
          System.out.print(" " + siguiente);
          t--;
        }
        break;
    }
    sc.close();
  }
}