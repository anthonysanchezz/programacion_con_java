/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
   El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
   de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
   entre 1 y 40 caracteres.
 * @author Antonio Sánchez
 */ 
/**
 * T06Ejercicio10
 */
public class T06Ejercicio10 {
  public static void main(String[] args) {
    int caracter = (int)(Math.random()*6);
    String Caracter = "";

    int longitud = (int)(Math.random()*41 + 1);

    switch (caracter) {
      case 0:
        Caracter = "*";
        break;
      case 1:
        Caracter = "-";
        break;
      case 2:
        Caracter = "=";
        break;
      case 3:
        Caracter = ".";
        break;
      case 4:
        Caracter = "|";
        break;
      case 5:
        Caracter = "@";
        break;
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < longitud; j++) {
        System.out.print(Caracter);
      }
      System.out.println();
    }
  }
}