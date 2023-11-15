/**
 * Imprime todos los multiplos de 5 del 0 al 100 con bucle while
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio02
 */
public class T05Ejercicio02 {
  public static void main(String[] args) {
    int i = 0;
    int control = 0;
    while (i <= 100) {
      i++;
      control = i % 5;
      if (control == 0) {
        System.out.println(i);
      }
    }
  }
}