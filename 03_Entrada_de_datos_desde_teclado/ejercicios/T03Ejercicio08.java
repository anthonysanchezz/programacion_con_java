
/**
 * T03Ejercicio08
 */
/**
 * Calcula el salario de un empleado según las horas trbajadas.
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;

    System.out.print("¿Cuántas horas has trabajado? ");
    horas = sc.nextInt();

    int salario = horas * 12;

    System.out.println("Tu salario es " + salario + " €");

    sc.close();
  }
}