
/**
 * T04Ejemplo03
 */
/**
 * Uso de sentencia switch con ejemplo de dias de la semana
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T04Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.print("Introduce el dia de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1, 2, 3, 4, 5:
        System.out.println("Es dia entre semana.");
        break;
      // case 2:
      // System.out.println("Es dia entre semana");
      // break;
      // case 3:
      // System.out.println("Es dia entre semana");
      // break;
      // case 4:
      // System.out.println("Es dia entre semana");
      // break;
      // case 5:
      // System.out.println("Es dia entre semana");
      // break;
      case 6, 7:
        System.out.println("Es fin de semana.");
        break;
      // case 7:
      // System.out.println("Es fin de semana");
      // break;
      default:
        System.out.println("No se asocia a ningún día de la semana.");
        break;
    }
    sc.close();
  }
}