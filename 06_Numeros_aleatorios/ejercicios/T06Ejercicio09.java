/**
  Realiza un programa que vaya generando números aleatorios pares entre 0
  y 100 y que no termine de generar números hasta que no saque el 24. El
  programa deberá decir al final cuántos números se han generado.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio09
 */
public class T06Ejercicio09 {
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;

    while (numero != 24) {
      numero = ((int)(Math.random()*50 + 1)) * 2;
      System.out.println(numero);
      contador++;
    }

    System.out.println("Se han generado " + contador + " números.");
  } 
}