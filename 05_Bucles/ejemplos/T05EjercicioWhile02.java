
/**
 * Contador de numeros positivos introducidos por pantalla
 * 
 * @author Antonio Sánchez
 */
/**
 * T05EjercicioWhile02
 */
import java.util.Scanner;

public class T05EjercicioWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252"); // Deja que se introduzcan caracteres españoles
    int num = 0; // Numero a introducir, inicializado en 0 para que entre al bucle while
    int i = 0; // Contador de numeros positivos
    int suma = 0;

    while (num >= 0) {
      System.out.print("Introduce un numero positivo: ");
      num = sc.nextInt();
      if (num > 0) {
        i++;
        suma += num; // Forma abreviada de poner suma = suma + num
      }
    }

    System.out.println("Has introducido " + i + " números positivos.");
    System.out.println("La suma de los " + i + " numeros introducidos es " + suma);

    sc.close();
  }
}