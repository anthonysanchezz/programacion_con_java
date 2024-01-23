/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio17
 */
public class T06Ejercicio17 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());

    int pececito = (int)(Math.random()*(altura - 2));
    int pez = (int)(Math.random()*(anchura - 2));

    for (int i = 0; i < anchura; i++) {
      System.out.print("* ");
    }

    System.out.println();

    for (int i = 0; i < altura - 2; i++) {
      System.out.print("* ");
      for (int j = 0; j < anchura - 2; j++) {
        if (j == pez && i == pececito) {
          System.out.print("& ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("* ");
    }

    for (int i = 0; i < anchura; i++) {
      System.out.print("* ");
    }
  }
}