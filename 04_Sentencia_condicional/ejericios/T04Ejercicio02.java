
/**
 * Pide la hora y da los buenos dias, tardes o noches
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio02
 */
import java.util.Scanner;

public class T04Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;

    System.out.print("¿Qué hora es? ");
    hora = sc.nextInt();

    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos días princesita ;)");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes guapetón :P");
    } else if (hora <= 5 || hora >= 21 && hora <= 24) {
      System.out.println("Buenas noches, descansa zZz");
    } else {
      System.out.println("Una hora válida pls crack!"); // En caso de no dar una hora valida imprime un "error"
    }
    sc.close();
  }
}