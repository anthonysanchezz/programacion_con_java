
/**
 * Calcula cuantos minutos quedan para el fin de semana
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio22
 */
import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60); // Desde lunes 00:00 hasta viernes 15:00
    int diasTranscurridos = 0;

    System.out.print("Que dia es (lunes a viernes)? ");
    String dia = sc.nextLine();

    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;
      case "martes":
        diasTranscurridos = 1;
        break;
      case "miercoles":
      case "miércoles":
        diasTranscurridos = 2;
        break;
      case "jueves":
        diasTranscurridos = 3;
        break;
      case "viernes":
        diasTranscurridos = 4;
        break;
      default:
        System.out.println("Solo dias de lunes a viernes!");
        break;
    }
    System.out.print("Introduce la hora: ");
    int horas = sc.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = sc.nextInt();

    int minutosTransucrridos = MINUTOSTOTALES - ((diasTranscurridos * 24 * 60) + (horas * 60) + minutos);
    int horasTranscurridas = minutosTransucrridos / 60;
    int minutorRestantes = minutosTransucrridos - (horasTranscurridas * 60);
    System.out.println(
        "Faltan " + horasTranscurridas + " horas y " + minutorRestantes + " minutos para llegar al fin de semana");
    sc.close();
  }
}