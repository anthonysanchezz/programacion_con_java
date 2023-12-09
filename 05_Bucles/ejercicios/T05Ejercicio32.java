/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio32
 */
import java.util.Scanner;
public class T05Ejercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor introduzca un número entero positivo: ");
    String numero = sc.nextLine();

    int longitud = numero.length();
    int digito = 0;
    int sumaPares = 0;

    System.out.print("Dígitos pares: ");

    for (int i = 0; i < longitud; i++) {
      digito = Character.getNumericValue(numero.charAt(i)); 
      if (digito % 2 == 0) {
        sumaPares += digito;
        System.out.print(digito + " ");
      }
    }
    System.out.println("");
    System.out.println("Suma de los dígitos pares: " + sumaPares);

    sc.close();
  }
}