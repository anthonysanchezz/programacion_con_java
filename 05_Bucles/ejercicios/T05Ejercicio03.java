/**
 * Imprime todos los multiplos de 5 del 0 al 100 con bucle do while
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio03
 */
public class T05Ejercicio03 {
  public static void main(String[] args) {
    int i = 0;
    int control = 0;
    do {
      i++;
      control = i % 5;
      if (control == 0) {
        System.out.println(i);
      }
    } while (i <= 100);
  }
}