
/**
 * T03Ejercicio09
 */
/**
 * Calcula el volumen de un cono introduciendo la base y la altura
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radio;
    double altura;

    System.out.print("Introduce el radio de tu cono: ");
    radio = sc.nextDouble();

    System.out.print("Introduce la altura de tu cono: ");
    altura = sc.nextDouble();

    double volumen = (3.14159265 * radio * altura * radio) / 3;

    System.out.println("El volumen de tu cono es " + volumen);

    sc.close();
  }
}