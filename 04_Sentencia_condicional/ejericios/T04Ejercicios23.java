
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicios23
 */
import java.util.Scanner;

public class T04Ejercicios23 {
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

    System.out.printf("Base impoible        %.2f\n", baseImponible);
    System.out.printf("IVA (%.0f%%)             %.2f\n", ((iva / baseImponible) * 100), iva);
    System.out.printf("Precio con IVA       %.2f\n", (baseImponible + iva));
    System.out.printf("Cód promo. (%5s): %.2f\n", codigoPromo, descPromo);
    System.out.printf("TOTAL                %.2f\n", total);

    sc.close();
  }
}