/**
 * Rota numeros de un array
 * 
 * @author Antonio Sánchez
 */
public class T07_Ejercicio06 {
  public static void main(String[] args) {
    int num[] = new int[6];
    System.out.println("Introduzca los números y pulse INTRO: ");
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i : num) {
      System.out.printf("%3d", i);
    }

    int aux = num[5];
    for (int i = num.length - 1; i > 0; i--) {
      num[i] = num[i - 1];
    }
    num[0] = aux;

    System.out.println();

    for (int i : num) {
      System.out.printf("%3d", i);
    }
  }
}
