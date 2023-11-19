
/**
 * Calcula la suma de los 100 siguientes numeros al introducido por teclado
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio17
 */
import java.util.Scanner;

public class T05Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.print("Introduce un numero entero positivo: ");
    n = sc.nextInt();

    int suma = 0;

    if (n > 0) {
      for (int i = (n + 1); i < (n + 101); i++) {
        suma += i;
      }
    }
    System.out.println(suma);
    sc.close();
  }
}