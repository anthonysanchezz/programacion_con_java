/**
 * T02Ejercicio06
 */
/**
 * Total con IVA
 * 
 * @author Antonio Sánchez
 */
public class T02Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 22.75;
    double importeIVA = baseImponible * 0.21;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", importeIVA);
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible + importeIVA));
  }
}