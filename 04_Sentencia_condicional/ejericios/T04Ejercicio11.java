
/**
 * Calcula cuantos segundos quedan para la media noche
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio11
 */
import java.util.Scanner;

public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int SEGUNDOS = (24 * 60 * 60);

    System.out.print("Qué hora es? ");
    int hora = sc.nextInt();

    if (hora >= 0 && hora < 24) {
      System.out.print("Cuantos minutos han pasado desde en punto? ");
      int minutos = sc.nextInt();
      int segundosFinales = SEGUNDOS - ((hora * 60 * 60) + minutos * 60);
      System.out.println("Quedan " + segundosFinales + " segundos para que acabe el día.");
    } else {
      System.out.println("Hora no válida");
      ;
    }
    sc.close();
  }
}