/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio20
 */
public class T06Ejercicio20 {
  public static void main(String[] args) {
    System.out.print("Indica la capacidad de la cuba: ");
    int capacidad = Integer.parseInt(System.console().readLine());

    int cantidad = (int)(Math.random()*(capacidad + 1));

    for (int i = 0; i < (capacidad - cantidad); i++) {
      System.out.println("*    *");
    }

    for (int i = 0; i < cantidad; i++) {
      System.out.println("*====*");
    }

    System.out.println("******");
  }
}