
/**
 * Ordena 3 numeros de menor a mayor
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio13
 */
import java.util.Scanner;

public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime el primer numero: ");
    int num1 = sc.nextInt();

    System.out.print("Dime el segundo numero: ");
    int num2 = sc.nextInt();

    System.out.print("Dime el tercer numero: ");
    int num3 = sc.nextInt();

    if (num1 > num2) {
      if (num2 > num3) {
        System.out.println(num1 + " " + num2 + " " + num3);
      } else if (num3 > num1) {
        System.out.println(num3 + " " + num1 + " " + num2);
      } else {
        System.out.println(num1 + " " + num3 + " " + num2);
      }
    } else if (num2 > num1) {
      if (num1 > num3) {
        System.out.println(num2 + " " + num1 + " " + num3);
      } else if (num3 > num2) {
        System.out.println(num3 + " " + num2 + " " + num1);
      } else {
        System.out.println(num2 + " " + num3 + " " + num1);
      }
    }

    sc.close();
  }
}
