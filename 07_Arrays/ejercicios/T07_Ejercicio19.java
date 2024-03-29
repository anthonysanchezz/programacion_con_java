/**
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejercicio19
 */
public class T07_Ejercicio19 {
  public static void main(String[] args) {
    int [] num = new int[12];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println("Array original: ");
    System.out.print("Indice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }
    System.out.print("\nIntroduzca el numero que quiere insertar: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo quiere insertar (0-11): ");
    int posicion = Integer.parseInt(System.console().readLine());

    for (int i = num.length - 1; i > posicion; i--) {
      num[i] = num[i - 1];
    }

    num[posicion] = numero;

    System.out.println("Array resultado: ");
    System.out.print("Indice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }
  }
}