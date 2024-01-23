/**
 * Ejemplo 2 de arrays
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejemplo02
 */
public class T07_Ejemplo02 {

  public static void main(String[] args) {
    int[] n = {26, -30, 0, 100, 50};                           // Declara la variable y lo define
  
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4]);

    int suma = n[1] + n[3];
    System.out.println("El resultado de sumar el segundo y el cuarto elemento es: " + suma);

    System.out.print("El array contiene " + n.length + " elementos, cual quieres ver? (0-4): ");
    int indice = Integer.parseInt(System.console().readLine());

    System.out.println("El elemento que se encuentra en la posicion " + indice + " es: " + n[indice]);

  }
}
