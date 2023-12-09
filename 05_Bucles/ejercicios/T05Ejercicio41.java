/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio41
 */
import java.util.Scanner;
public class T05Ejercicio41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = sc.nextInt();

    String num = Integer.toString(numero);

    int longitud = num.length();

    int pares = 0;
    int impares = 0;

    int x = 0;

    for (int i = 0; i < longitud; i++) {
      x = Character.getNumericValue(num.charAt(i));
      if (x % 2 == 0) {
        pares += 1;
      } else {
        impares += 1;
      }
    }

    System.out.println("El número " + numero + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");

    sc.close();
  }
} 