/**
 * Tablas del 2, 4 y 6
 * 
 * @author Antonio Sánchez
 */
/**
 * T05EjemploFor02
 */
public class T05EjemploFor02 {
  public static void main(String[] args) {
    for (int i = 2; i < 7; i = i + 2) {
      for (int j = 0; j < 11; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }
  }
}