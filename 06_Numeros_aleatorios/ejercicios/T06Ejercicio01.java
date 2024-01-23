/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio01
 */
public class T06Ejercicio01 {
  public static void main(String[] args) {
    int suma = 0;
    int tirada = 0;

    for (int i = 0; i < 3; i++) {
      System.out.print("Dado " + (i + 1) + ": ");
      tirada = (int)(Math.random()*7);
      System.out.println(tirada);
      suma += tirada;
    }
    System.out.println("La suma de las tres tiradas es: " + suma);
  }
}