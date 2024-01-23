/**
  Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
  adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
  el programa dirá cuántas oportunidades quedan y si el número introducido es
  menor o mayor que el número secreto.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio06
 */
public class T06Ejercicio06 {
  public static void main(String[] args) {
    int numeroAAcertar = (int)(Math.random()*100);
    
    System.out.print("Adivina el número: ");

    int numero;
    for (int i = 4; i >= 0; i--) {
      numero = Integer.parseInt(System.console().readLine());
      if (numero == numeroAAcertar) {
        System.out.println("Enhorabuena, has acertado");
        break;
      } else {
        if (numero > numeroAAcertar) {
          System.out.println("Incorrecto, te quedan " + i + " intentos. (Más pequeño)");
        } else {
          System.out.println("Incorrecto, te quedan " + i + " intentos. (Más grande)");
        }
      }
    }
  }
}