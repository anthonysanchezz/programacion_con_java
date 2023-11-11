
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio15
 */
import java.util.Scanner;

public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c;

    System.out.print("Dame cualquier caracter: ");
    c = sc.nextLine();

    String direccion;
    System.out.print("Dime hacia donde quieres que este la punta (arriba/abajo): ");
    direccion = sc.nextLine();

    switch (direccion) {
      case "arriba":
        System.out.print("Dime hacia donde quieres que este la punta (derecha/izquierda): ");
        direccion = sc.nextLine();
        switch (direccion) {
          case "derecha":
            System.out.println(" " + " " + " " + c);
            System.out.println(" " + " " + c + c);
            System.out.println(" " + c + c + c);
            System.out.println(c + c + c + c);
            break;
          case "izquierda":
            System.out.println(c + " " + " " + " ");
            System.out.println(c + c + " " + " ");
            System.out.println(c + c + c + " ");
            System.out.println(c + c + c + c);
            break;
          default:
            System.out.println("Izquierda o derecha no hay mas, ¡cateto!");
            break;
        }
        break;
      case "abajo":
        System.out.print("Dime hacia donde quieres que este la punta (derecha/izquierda): ");
        direccion = sc.nextLine();
        switch (direccion) {
          case "derecha":
            System.out.println(c + c + c + c);
            System.out.println(" " + c + c + c);
            System.out.println(" " + " " + c + c);
            System.out.println(" " + " " + " " + c);
            break;
          case "izquierda":
            System.out.println(c + c + c + c);
            System.out.println(c + c + c + " ");
            System.out.println(c + c + " " + " ");
            System.out.println(c + " " + " " + " ");
            break;
          default:
            System.out.println("Izquierda o derecha no hay mas, ¡cateto!");
            break;
        }
      default:
        System.out.println("Arriba o abajo solo.");
        break;
    }

    sc.close();
  }
}