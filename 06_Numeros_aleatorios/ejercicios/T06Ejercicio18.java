/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio18
 */
public class T06Ejercicio18 {
  public static void main(String[] args) {
    String Colores1 = "";
    String Colores2 = "";
    String Colores3 = "";
    int color1;
    int color2;
    int color3;

    do {
      color1 = (int)(Math.random()*6);
      color2 = (int)(Math.random()*6);
      color3 = (int)(Math.random()*6);
    } while ((color1 == color2) || (color1 == color3) || (color2 == color3));

    switch (color1) {
        case 0:
          Colores1 = "rojo";
          break;
        case 1:
          Colores1 = "azul";
          break;
        case 2:
          Colores1 = "verde";
          break;
        case 3:
          Colores1 = "amarillo";
          break;
        case 4:
          Colores1 = "violeta";
          break;
        case 5:
          Colores1 = "naranja";
          break;
      }

      switch (color2) {
        case 0:
          Colores2 = "rojo";
          break;
        case 1:
          Colores2 = "azul";
          break;
        case 2:
          Colores2 = "verde";
          break;
        case 3:
          Colores2 = "amarillo";
          break;
        case 4:
          Colores2 = "violeta";
          break;
        case 5:
          Colores2 = "naranja";
          break;
      }

      switch (color3) {
        case 0:
          Colores3 = "rojo";
          break;
        case 1:
          Colores3 = "azul";
          break;
        case 2:
          Colores3 = "verde";
          break;
        case 3:
          Colores3 = "amarillo";
          break;
        case 4:
          Colores3 = "violeta";
          break;
        case 5:
          Colores3 = "naranja";
          break;
      }
      
      System.out.println("Habitación 1: " + Colores1);
      System.out.println("Habitación 1: " + Colores2);
      System.out.println("Habitación 1: " + Colores3);
  }
}
