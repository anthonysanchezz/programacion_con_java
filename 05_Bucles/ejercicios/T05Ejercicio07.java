/**
 * Pide codigo de caja fuerte con 4 cifras, solo 4 intentos
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio07
 */
public class T05Ejercicio07 {
  public static void main(String[] args) {
    int clave = 1234;
    int respuesta = 0;
    int intentos = 0;
    do {
      System.out.print("Dame la clave: ");
      respuesta = Integer.parseInt(System.console().readLine());
      if (respuesta == clave) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
      }
      intentos++;
    } while (respuesta != clave && intentos < 4);
  }
}