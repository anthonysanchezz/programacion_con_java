/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio26
 */
import java.util.Scanner;
public class T05Ejercicio26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dame un número: ");         
    int numero = sc.nextInt();                          // Pide un número entero al usuario

    System.out.print("Dime un dígito: ");
    int digito = sc.nextInt();                          // Pide el dígito a evaluar

    String num = Integer.toString(numero);              // Pasa el número introducido a palabra para evaluar su longitud

    int longitud = num.length();                        // Evalúa la longitud

    int i = 0;                                          // Inicializa las repeticiones del bucle a 0

    int x;                                              // Dígito de control para comprobar en el bucle si el dígito introducido está contenido en el número

    while (i < longitud) {                              // Se repite el bucle tantas veces como la longitud del número introducido
      x = Character.getNumericValue(num.charAt(i));     // Se localiza la posición del dígito usando la palabra del número
      if (x == digito) {                                // Si este dígito de control es igual al introducido por el usuario;
        System.out.println("Posición: " + (i + 1));     // Se imprime esta posición (i + 1)
      } 
      i++;                                              // Y se aumenta la iteración del bucle para volver a comprobar
    }

    sc.close();
  }
}