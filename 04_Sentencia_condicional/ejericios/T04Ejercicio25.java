
/**
 * Calcula precio de banderas segun su tamaño y si tiene bordado o no
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio25
 */
import java.util.Scanner;

public class T04Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = sc.nextInt();

    System.out.print("Ahora introduzca la anchura: ");
    int anchura = sc.nextInt();

    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String bordado = System.console().readLine();

    int metrosCuadrados = altura * anchura;
    double precioPorCmCuadrado = (altura * anchura) / 100;
    double precioBordado = 0;

    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %d cm2: %5.2f €\n", metrosCuadrados, precioPorCmCuadrado);
    switch (bordado) {
      case "s":
        System.out.println("Sin escudo:          0,00 €");
        break;
      case "n":
        System.out.println("Con escudo:          2,50 €");
        precioBordado = 2.5;
        break;
      default:
        System.out.println("No válido");
        break;
    }
    System.out.println("Gastos de envío:     3,25 €");
    System.out.printf("Total:              %5.2f €", precioPorCmCuadrado + precioBordado + 3.25);
    sc.close();
  }
}