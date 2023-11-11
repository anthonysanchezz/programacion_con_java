
/**
 * Te dice cual es tu nota media
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio21
 */
import java.util.Scanner;

public class T04Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nota del primer control: ");
    int nota1 = sc.nextInt();

    System.out.print("Nota del primer control: ");
    int nota2 = sc.nextInt();

    double media = (double) (nota1 + nota2) / 2;

    if (media < 5) {
      System.out.print("¿Cual ha sido el resultado de la recuperación? (apto/no apto): ");
      String recu = System.console().readLine();
      if (recu == "apto") {
        media = 5;
      }
    }
    System.out.printf("Tu nota de programación es %.2f", media);

    sc.close();
  }
}