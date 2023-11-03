
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

    double volumen = (Math.PI * (Math.pow(radio, 2)) * altura) / 3;

    System.out.printf("El volumen de tu cono es %.2f m3", volumen);

    sc.close();
  }
}