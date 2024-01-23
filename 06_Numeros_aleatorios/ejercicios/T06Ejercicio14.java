/**
  Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
  programa intentará adivinar el número que estás pensando - un número entre 0
  y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
  debe preguntar si el número que estás pensando es mayor o menor que el que
  te acaba de decir.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio14
 */
public class T06Ejercicio14 {
  public static void main(String[] args) {
    // boolean Respuesta = false;
    String res = "";

    String mayormenor = "";

    int mayor = 0;
    int menor = 101;

    int intentos = 10;
    int numero = 0;

    numero = (int)(Math.random()*(menor));
    
    for (int i = intentos; i > 0; i--) {
      // while (!Respuesta && intentos > 0)
      // numero = (int)(Math.random()*(resto));
      // System.out.println(numero);
      System.out.println(numero);
      System.out.print("¿He adivinado tu número? ");
      res = System.console().readLine();
      if (res.equals("si")) {
        break;
      } else {
        System.out.print("¿Es mayor o menor? ");
        mayormenor = System.console().readLine();
        if (mayormenor.equals("menor")) {
          menor = numero + 1;
          numero = (int)(Math.random()*(mayor - menor) + menor);
        } else if (mayormenor.equals("mayor")) {
          mayor = numero - 1;
          numero = (int)(Math.random()*(mayor - menor) + menor);
        }
      }
    }
  }
}