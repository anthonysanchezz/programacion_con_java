/**
  Realiza un programa que muestre al azar el nombre de una carta de la baraja
  francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
  y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
  numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
  Para convertir un número en una cadena de caracteres podemos usar
  String.valueOf(n).
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio02
 */
public class T06Ejercicio02 {
  public static void main(String[] args) {
    int palo = (int)(Math.random()*4);
    String Palo = "";

    int numero = (int)(Math.random()*13);
    String Numero = "";

    switch (palo) {
      case 0:
        Palo = "picas";
        break;
      case 1:
        Palo = "corazones";
        break;
      case 2:
        Palo = "diamantes";
        break;
      case 3:
        Palo = "tréboles";
        break;
    }

    switch (numero) {
      case 0:
        Numero = "A";
        break;
      case 10:
        Numero = "J";
        break;
      case 11:
        Numero = "Q";
        break;
      case 12:
        Numero = "K";
        break;
      default:
        Numero = String.valueOf(numero);
        break;
    }

    System.out.println("Tu carta es: " + Numero + " de " + Palo);
  }
}