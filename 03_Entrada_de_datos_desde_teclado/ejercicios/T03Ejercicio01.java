
/**
 * T03Ejercicio01
 */
/**
 * Pide dos números y que luego muestra el resultado de su multiplicación
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Dime un número: ");
    num1 = sc.nextInt();

    System.out.print("Dime un número: ");
    num2 = sc.nextInt();

    int multiplicacion = num1 * num2;

    System.out.println("El producto de " + num1 + " y " + num2 + " es " + multiplicacion);

    sc.close();
  }
}