
/**
 * Pide por teclado un día de la semana y que dice qué asignatura toca a primera hora ese día.
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio01
 */
import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Dia;

    System.out.print("¿Qué día de la semana es? ");
    Dia = sc.nextLine();

    switch (Dia) {
      case "lunes", "Lunes":
        System.out.println("La primera clase es FOL.");
        break;
      case "martes", "Martes", "viernes", "Viernes":
        System.out.println("La primera clase es Programación.");
        break;
      case "miercoles", "miércoles", "Miercoles", "Miércoles":
        System.out.println("La primera clase es Entorno de Desarrollo.");
        break;
      case "jueves", "Jueves":
        System.out.println("La primera clase es Base de Datos.");
        break;
      case "sabado", "Sabado", "sábado", "Sábado", "domingo", "Domingo":
        System.out.println("No hay clase crack!");
        break;
      default:
        System.out.println("Un dia de la semana por favor...");
        break;
    }
    sc.close();
  }
}