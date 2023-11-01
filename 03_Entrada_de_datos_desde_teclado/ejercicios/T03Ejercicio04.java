
/**
 * T03Ejercicio04
 */
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Introduce un número: ");
    num1 = sc.nextInt();

    System.out.print("Introduce otro número: ");
    num2 = sc.nextInt();

    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    double division = (double) (num1 / num2);

    System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
    System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
    System.out.println("El producto de " + num1 + " y " + num2 + " es " + multiplicacion);
    System.out.println("La división entre " + num1 + " y " + num2 + " es " + division);

    sc.close();
  }
}