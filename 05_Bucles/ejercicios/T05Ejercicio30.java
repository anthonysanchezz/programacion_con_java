/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio30
 */
import java.util.Scanner;
public class T05Ejercicio30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduzca la primera hora");
    System.out.print("Día (1-7): ");
    int dia1 = sc.nextInt();
    System.out.print("Hora: ");
    int hora1 = sc.nextInt();
    System.out.println("Por favor, introduzca la segunda hora");
    System.out.print("Día (1-7): ");
    int dia2 = sc.nextInt();
    System.out.print("Hora: ");
    int hora2 = sc.nextInt();
    
    int horasUltimoDia = (dia2 * 24) + hora2;
    int horasPrimerDia = (dia1 * 24) + hora1;

    int horas = 0;

    String dia = "";

    switch (dia1) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sabado";
        break;
      case 7:
        dia = "domingo";
        break;          
    }

    String DIA = "";

    switch (dia2) {
      case 1:
        DIA = "lunes";
        break;
      case 2:
        DIA = "martes";
        break;
      case 3:
        DIA = "miércoles";
        break;
      case 4:
        DIA = "jueves";
        break;
      case 5:
        DIA = "viernes";
        break;
      case 6:
        DIA = "sabado";
        break;
      case 7:
        DIA = "domingo";
        break;          
    }

    if (dia1 < dia2 || (dia1 == dia2) && hora1 <= hora2) {
      horas = horasUltimoDia - horasPrimerDia;
    } else {
      System.out.println("INCORRECTO!!!");
    }

    System.out.println("Entre las " + hora1 + ":00h del " + dia + " y las " + hora2 + ":00h del " + DIA + " hay " + horas + " hora/s.");

    sc.close();

    // La verdad es que no se me ocurre como hacerlo con bucles
  }
}