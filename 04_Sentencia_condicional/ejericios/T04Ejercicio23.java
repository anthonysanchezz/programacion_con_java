
/**
 * Imprime ticket segun base, IVA y descuento
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio23
 */
import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = sc.nextDouble();

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromo = System.console().readLine();

    double iva = 0;

    double descPromo = 0;

    switch (tipoIVA) {
      case "general":
        iva = baseImponible * 0.21;
        break;
      case "reducido":
        iva = baseImponible * 0.1;
        break;
      case "superreducido":
        iva = baseImponible * 0.04;
        break;
      default:
        System.out.println("Tipo de IVA no valido.");
        break;
    }
    switch (codigoPromo) {
      case "nopro":
        descPromo = 0;
        break;
      case "mitad":
        descPromo = -((baseImponible + iva) * 0.5);
        break;
      case "meno5":
        descPromo = -5;
        break;
      case "5porc":
        descPromo = -((baseImponible + iva) * 0.05);
        break;
      default:
        break;
    }

    double total = (baseImponible + iva) + descPromo;

    System.out.printf("%-22s %.2f\n", "Base imponible", baseImponible);
    System.out.printf("%s (%.0f%%) %13s %.2f\n", "IVA", ((iva / baseImponible) * 100), " ", iva);
    System.out.printf("%-22s %.2f\n", "Precio con IVA", (baseImponible + iva));
    System.out.printf("%s (%5s):%4s %.2f\n", "Cód promo.", codigoPromo, " ", descPromo);
    System.out.printf("%-22s %.2f\n", "TOTAL", total);

    sc.close();
  }
}