
/**
 * Dice si tu pareja te es infiel
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio16
 */
import java.util.Scanner;

public class T04Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Responde las siguientes preguntas (v/f)");
    int nota = 0;
    Scanner sc = new Scanner(System.in);
    String p1;

    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    p1 = sc.nextLine();

    if (p1 == "v") {
      nota += 3;
    } else {
      nota += 0;
    }

    String p2;

    System.out.print("Ha aumentado sus gastos de vestuario: ");
    p2 = sc.nextLine();

    if (p2 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p3;

    System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
    p3 = sc.nextLine();

    if (p3 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p4;

    System.out.print(
        "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    p4 = sc.nextLine();

    if (p4 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p5;

    System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
    p5 = sc.nextLine();

    if (p5 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p6;

    System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    p6 = sc.nextLine();

    if (p6 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p7;

    System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    p7 = sc.nextLine();

    if (p7 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p8;

    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    p8 = sc.nextLine();

    if (p8 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p9;

    System.out.print("Has notado que últimamente se perfuma más: ");
    p9 = sc.nextLine();

    if (p9 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    String p10;

    System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    p10 = sc.nextLine();

    if (p10 == "v") {
      nota = nota + 3;
    } else {
      nota = nota + 0;
    }

    if (nota > 0 && nota <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel!");
    } else if (nota <= 22) {
      System.out.println(
          "Quizás exista el peligro e otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else {
      System.out.println(
          "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    sc.close();
  }
}