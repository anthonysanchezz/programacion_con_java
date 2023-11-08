
/**
 * Calcula e imprime la media de tres examanes, adicionalmente da la nota del boletín (insuficiente,
   suficiente, bien, notable o sobresaliente).
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio08
 */
import java.util.Scanner;

public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1;

    System.out.print("Da la primera nota: ");
    n1 = sc.nextDouble();

    double n2;

    System.out.print("Da la segunda nota: ");
    n2 = sc.nextDouble();

    double n3;

    System.out.print("Da la tercera nota: ");
    n3 = sc.nextDouble();

    double media = (n1 + n2 + n3) / 3;

    System.out.printf("La media es %.2f ; ", media);

    if (media < 5) {
      System.out.println("tu nota es insuficiente, sigue esforzandote!");
    } else if (media < 6) {
      System.out.println("tu nota es suficiente, por los pelos de un calvo!");
    } else if (media < 7) {
      System.out.println("tu nota es un bien :P");
    } else if (media < 9) {
      System.out.println("tu nota es un notable, buena crack!");
    } else if (media == 10) {
      System.out.println("tu nota es un sobresaliente, enhorabuena!");
    } else {
      System.out.println("esto no es una nota media válida, definitivamente las mates no las llevas bien...");
    }

    sc.close();
  }
}