
/**
 * Calcula salario en base a dias trabajados
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio04
 */
import java.util.Scanner;

public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;

    System.out.print("¿Cuántas horas has trabajado? ");
    horas = sc.nextInt();

    int salario;

    if (horas <= 40) {
      salario = horas * 12;
    } else if (horas > 40) {
      salario = 480 + ((horas - 40) * 16);
    } else {
      salario = 0;
    }

    System.out.println("Tu salario es " + salario + "€");

    sc.close();
  }
}