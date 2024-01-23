/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejercicio05
 */
public class T07_Ejercicio05 {
  public static void main(String[] args) {
    int[] num = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce el " + (i + 1) + "º número y pulsa INTRO: ");
      num[i] = Integer.parseInt(System.console().readLine());
      if (num[i] > maximo) {
        maximo = num[i];
      }
      if (num[i] < minimo) {
        minimo = num[i];
      }
    }
    
    for (int i = 0; i < num.length; i++) {
      System.out.print("El " + (i + 1) + "º número es " + num[i]);
      if (num[i] == maximo) {
        System.out.print(" máximo");
      }
      if (num[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}