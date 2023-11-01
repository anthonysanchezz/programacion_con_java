
/**
 * T03Ejercicio12
 */
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1;
    double media;

    System.out.print("Introduce la nota del primer examen: ");
    nota1 = sc.nextDouble();

    System.out.print("¿Que nota quieres sacar en el trimestre? ");
    media = sc.nextDouble();

    double nota2 = (media - (nota1 * 0.4)) / 0.6;

    System.out
        .println("Para tener un " + media + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");

    sc.close();
  }
}