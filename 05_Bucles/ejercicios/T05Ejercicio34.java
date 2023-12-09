/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio34
 */
import java.util.Scanner;
public class T05Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor introduzca un número: ");
    String num1 = sc.nextLine();

    System.out.print("Introduzca otro número: ");
    String num2 = sc.nextLine();

    int longitud = num1.length();
    int div = 0;

    String pares = "";
    String impares = "";

    for (int i = 0; i < longitud; i++) {
      div = Character.getNumericValue(num1.charAt(i));
      if (div % 2 == 0) {
        pares += div;
      } else {
        impares += div;
      }
      for (int j = i; j <= i; j++) {
        div = Character.getNumericValue(num2.charAt(i));
        if (div % 2 == 0) {
        pares += div;
      } else {
        impares += div;
      }
      }
    }

    System.out.println("El número formado por los dígitos pares es: " + pares);
    System.out.println("El número formado por los dígitos impares es: " + impares);

    sc.close();
  }
}