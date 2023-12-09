/**
 * Imprime todos los números primos desde el 2 al 100
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio22
 */
public class T05Ejercicio22 {
  public static void main(String[] args) {

    boolean esPrimo = true;                           // Se inicia la condición de que cualquier número sea primo

    for (int num = 2; num <= 100; num++) {            // Se comprueban todos los números del 2 al 100
      esPrimo = true;                                 // Y se da por hecho que son primos
      for (int i = 2; i < num; i++) {                 // Aquí se comprueba si realmente lo son, dividiéndolos entre todos los números desde el 2 hasta el mismo número que se está examinando
        if (num % i == 0) {                           // Si el número que está siendo examinado es divisible entre algún otro número,
          esPrimo = false;                            // ya no es considerado como primo
        }
      }
      if (esPrimo) {                                  // Si sí que es primo,
        System.out.println(num);                      // Se imprime este número
      }
    }
  }
}