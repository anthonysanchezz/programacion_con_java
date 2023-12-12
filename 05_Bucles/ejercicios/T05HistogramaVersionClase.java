/**
 * Histograma horizontal, corrección clase 12/12
 * 
 * @author Antonio Sánchez
 */
/**
 * T05HistogramaVersionClase
 */
import java.util.Scanner;
public class T05HistogramaVersionClase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cifraIntroducida = 0;
    long numeroCompleto = 0;
    long numeroVolteado = 0;
    int mayor = 0;
    int digito = 0;

    System.out.println("Introduce números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si desea parar.");

    int longitud = 0;

    while (cifraIntroducida >= 0) {
      cifraIntroducida = sc.nextInt();
      if (cifraIntroducida >= 0 && cifraIntroducida <= 9) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
        longitud++;
        if (mayor < cifraIntroducida) {
          mayor = cifraIntroducida;
        }
      }
    }

    while (numeroCompleto != 0) {
      digito = (int) (numeroCompleto % 10);
      numeroVolteado = (numeroVolteado * 10) + digito;
      numeroCompleto /= 10;
    }

    int numeroColumnas = mayor + 1;
    int numeroFilas = longitud;

    for (int i = 0; i < numeroColumnas; i++) {
      System.out.print(" ---");
    }
    for (int i = 0; i < numeroFilas; i++) {
      System.out.println("");
      digito = (int) (numeroVolteado % 10);
      numeroVolteado /= 10;
      System.out.print("| " + digito + " |");
      for (int j = 0; j < mayor; j++) {
        if (j < digito) {
          System.out.print(" * |");
        } else {
          System.out.print("   |");
        }
      }
      System.out.println("");
      for (int j = 0; j < numeroColumnas; j++) {
        System.out.print(" ---");
      }
    }

    sc.close();
  }
}