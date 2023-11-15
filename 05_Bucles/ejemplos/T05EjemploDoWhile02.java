
/**
 * Programa que para cuando se introduce numero impar
 * 
 * @author Antonio Sánchez
 */
/**
 * T05EjemploDoWhile02
 */
public class T05EjemploDoWhile02 {
  public static void main(String[] args) {
    int num;
    do {
      System.out.print("Introduce un numero par: ");
      num = Integer.parseInt(System.console().readLine());
      if (num % 2 == 0) {
        System.out.println("El numero " + num + " es par, sigue");
      } else {
        System.out.println("El numero " + num + " es impar, adiós");
      }
    } while (num % 2 == 0);
  }
}