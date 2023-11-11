
/**
 * Da tu signo del zodiaco
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio10
 */
import java.util.Scanner;

public class T04Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime en que mes naciste: ");
    String mes = sc.nextLine();
    System.out.print("¿Qué día? ");
    int dia = sc.nextInt();

    switch (mes) {
      case "enero", "1":
        if (dia <= 19) {
          System.out.println("Capricornio");
        } else {
          System.out.println("Acuario");
        }
        break;
      case "febrero", "2":
        if (dia <= 18) {
          System.out.println("Acuario");
        } else {
          System.out.println("Piscis");
        }
        break;
      case "marzo", "3":
        if (dia <= 20) {
          System.out.println("Piscis");
        } else {
          System.out.println("Aries");
        }
        break;
      case "abril", "4":
        if (dia <= 19) {
          System.out.println("Aries");
        } else {
          System.out.println("Tauro");
        }
        break;
      case "mayo", "5":
        if (dia <= 20) {
          System.out.println("Tauro");
        } else {
          System.out.println("Geminis");
        }
        break;
      case "junio", "6":
        if (dia <= 20) {
          System.out.println("Geminis");
        } else {
          System.out.println("Cáncer");
        }
        break;
      case "julio", "7":
        if (dia <= 22) {
          System.out.println("Cáncer");
        } else {
          System.out.println("Leo");
        }
        break;
      case "agosto", "8":
        if (dia <= 22) {
          System.out.println("Leo");
        } else {
          System.out.println("Virgo");
        }
        break;
      case "septiembre", "9":
        if (dia <= 22) {
          System.out.println("Virgo");
        } else {
          System.out.println("Libra");
        }
        break;
      case "octubre", "10":
        if (dia <= 22) {
          System.out.println("Libra");
        } else {
          System.out.println("Escorpio");
        }
        break;
      case "noviembre", "11":
        if (dia <= 21) {
          System.out.println("Escorpio");
        } else {
          System.out.println("Sagitario");
        }
        break;
      case "diciembre", "12":
        if (dia <= 21) {
          System.out.println("Sagitario");
        } else {
          System.out.println("Aries");
        }
        break;
      default:
        System.out.println("Un mes del año terrestre pls");
        break;
    }

    sc.close();
  }
}