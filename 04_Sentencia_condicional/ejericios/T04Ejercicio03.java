
/**
 * Imprime dia de la semana segun numero introducido
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio03
 */
import java.util.Scanner;

public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int diaSemana;

    System.out.print("¿Qué número de día es? ");
    diaSemana = sc.nextInt();

    switch (diaSemana) {
      case 1:
        System.out.println("Es lunes.");
        break;
      case 2:
        System.out.println("Es martes.");
        break;
      case 3:
        System.out.println("Es miércoles.");
        break;
      case 4:
        System.out.println("Es jueves.");
        break;
      case 5:
        System.out.println("Es viernes.");
        break;
      case 6:
        System.out.println("Es sábado.");
        break;
      case 7:
        System.out.println("Es domingo.");
        break;
      default:
        System.out.println("Un número entre el 1 y el 7 pls.");
        break;
    }

    sc.close();
  }
}
