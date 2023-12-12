/**
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio47
 */
import java.util.Scanner;
public class T05Ejercicio47 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
    int altura = sc.nextInt();

    if (altura < 5 || altura % 2 != 0) {
      System.out.println("La altura introducida no es correcta");
    }
  
    for (int i = 1; i <= 5; i++) {
      System.out.print("M");
    }
    System.out.println("");
    for (int i = 0; i < (altura - 3) / 2; i++) {
      System.out.print("M");
      for (int j = 0; j < 3; j++) {
        System.out.print(" ");
      }
      System.out.println("M");
    }
    for (int i = 1; i <= 5; i++) {
      System.out.print("M");
    }
    System.out.println("");
    for (int i = 0; i < (altura - 3) / 2; i++) {
      System.out.print("M");
      for (int j = 0; j < 3; j++) {
        System.out.print(" ");
      }
      System.out.println("M");
    }
    for (int i = 1; i <= 5; i++) {
      System.out.print("M");
    }


    sc.close();
  }
}