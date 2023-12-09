/**
 * Le da la vuelta a un número insertado por teclado
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio25
 */
import java.util.Scanner;
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dame un número y doy la vuelta: ");
    int numero = sc.nextInt();
    String num = Integer.toString(numero);                    // Pasa el número a cadena de texto
    String numAlReves = "";

    int div = 0;

    int longitud = num.length();                              // Obtiene la longitud de la cadena

    for (int i = 1; i <= longitud; i++) {                     // Bucle para repetir tantas veces como la longitud del número sea
      div = (int) (numero % 10);                              // Me quedo con el resto del número dividido entre 10 para obtener el último dígito
      numero /= 10;                                           // Hago que el número se convierta en el mismo entre 10 para desprenderme del último dígito
      numAlReves += div;                                      // Añado el resto (último dígito de cada iteración) al String vacío
    }                                                         // Se repite hasta cumplir la condición

    System.out.println(numAlReves);                           // Imprimo el número al revés

    sc.close();
  }
}