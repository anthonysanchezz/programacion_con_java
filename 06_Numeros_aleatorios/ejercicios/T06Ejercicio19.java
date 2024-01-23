/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio19
 */
public class T06Ejercicio19 {
  public static void main(String[] args) {
    int numero = 0;
    int mayorPar = 0;
    int menorImpar = 0;
    int suma = 0;

    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random()*301 - 101);
      System.out.print(numero + " ");
      if (numero % 2 == 0) {
        if (numero > mayorPar) {
          mayorPar = numero;
        }
      } else {
        if (numero < menorImpar) {
          menorImpar = numero;
        }
      }
      suma += numero;
    }

    int media = suma / 50;

    System.out.println("\nEl mayor par es " + mayorPar);
    System.out.println("El menor impar es " + menorImpar);
    System.out.println("La media es " + media);
  }
}