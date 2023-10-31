
/**
 * T04Ejemplo01
 */
/**
 * Pregunta al usuario que nota saca en el examen y dice si has suspendido
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T04Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;

    System.out.print("¿Que nota has sacado?");
    nota = sc.nextInt();

    if (nota >= 5) {
      System.out.println("Enhorabuena, has aprobado!");
    } else {
      System.out.println("Has suspendido...");
    }
    sc.close();
  }
}