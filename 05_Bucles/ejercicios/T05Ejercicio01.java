/**
 * Imprime todos los multiplos de 5 del 0 al 100 con bucle for
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio01
 */
public class T05Ejercicio01 {
  public static void main(String[] args) {
    int control = 0;
    for (int i = 0; i <= 100; i++) {
      control = i % 5;
      if (control == 0) {
        System.out.println(i);
      }
    }
  }
}