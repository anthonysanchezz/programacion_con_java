/**
  Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
  de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio03
 */
public class T06Ejercicio03 {
  public static void main(String[] args) {
    int palo = (int)(Math.random()*4);
    String Palo = "";

    int numero = (int)(Math.random()*10);
    String Numero = "";

    switch (palo) {
      case 0:
        Palo = "oros";
        break;
      case 1:
        Palo = "copas";
        break;
      case 2:
        Palo = "espadas";
        break;
      case 3:
        Palo = "bastos";
        break;
    }

    switch (numero) {
      case 0:
        Numero = "as";
        break;
      case 7:
        Numero = "sota";
        break;
      case 8:
        Numero = "caballo";
        break;
      case 9:
        Numero = "rey";
        break;
      default:
        Numero = String.valueOf(numero);
        break;
    }

    System.out.println("Tu carta es: " + Numero + " de " + Palo);
  }
}