/**
  Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
  separados por espacios. Muestra también el máximo, el mínimo y la media
  de esos números.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio05
 */
public class T06Ejercicio05 {
  public static void main(String[] args) {
    int numero = 0;

    int maximo = 0;
    int minimo = 200;

    int suma = 0;

    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random()*100 + 100);
      System.out.print(numero + " ");
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
      suma += numero;
    }

    System.out.println("\nEl máximo es " + maximo);
    System.out.println("El mínimo es " + minimo);
    System.out.println("La media es " + (suma / 50));
  }
}