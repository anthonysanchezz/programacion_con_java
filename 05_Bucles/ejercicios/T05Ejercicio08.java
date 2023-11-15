/**
 * Muestra la tabla de multiplicar de un numero introducido por pantalla
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio08
 */
public class T05Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduce un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    for (int i = 0; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + num * i);
    }
  }
}