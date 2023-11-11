
/**
 * Calcula cual es el último dígito de un número (hasta el numero)
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio17
 */
import java.util.Scanner;

public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero entero: ");
    numero = sc.nextInt();

    int ultimoDigito = numero % 10;

    System.out.println("El último dígito es: " + ultimoDigito);

    sc.close();
  }
}