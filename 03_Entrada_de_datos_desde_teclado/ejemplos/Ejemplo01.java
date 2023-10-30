/**
 * Ejemplo01
 */
/**
 * Entrada por teclado
 * 
 * @author Antonio Sánchez
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    String nombre;
    System.out.print("Dime como te llamas: ");
    nombre = System.console().readLine();

    System.out.println("¡Hola " + nombre + "! Bienvenido a programacion");
  }
}