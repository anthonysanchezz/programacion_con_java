/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio13
 */
public class T06Ejercicio13 {
  public static void main(String[] args) {
    int tirada1 = 0;
    int tirada2 = 1;

    System.out.println("Juego de dados");
    while (tirada1 != tirada2) {
      System.out.println("---");
      tirada1 = (int)(Math.random()*7 + 1);
      tirada2 = (int)(Math.random()*7 + 1);
      System.out.println(" " + tirada1);
      System.out.println(" " + tirada2);
    }
  }
}