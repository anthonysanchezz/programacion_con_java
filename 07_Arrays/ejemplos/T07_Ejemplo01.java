/**
 * Ejemplo 1 de arrays
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejemplo01
 */
public class T07_Ejemplo01 {

  public static void main(String[] args) {
    int[] n;                                // Declara la variable
    n = new int[4];                         // Establece como de grande es el array

    n[0] = 26;                              // Da valor a cada espacio del array
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;
  
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);  // Para usarlos, se llaman con el nombre del array y la posición

    int suma = n[1] + n[3];
    System.out.println("El resultado de sumar el segundo y el cuarto elemento es: " + suma);

  }
}
