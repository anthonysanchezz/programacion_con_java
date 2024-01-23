/**
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio21
 */
public class T06Ejercicio21 {
  public static void main(String[] args) {
    int moneda = 0;
    String Moneda = "";

    int cara = 0;
    String Cara = "";

    for (int i = 0; i < 5; i++) {
      moneda = (int)(Math.random()*8);
      cara = (int)(Math.random()*2);

      switch (moneda) {
        case 0:
          Moneda = "1 céntimo";
          break;
        case 1:
          Moneda = "2 céntimos";
          break;
        case 2:
          Moneda = "5 céntimos";
          break;
        case 3:
          Moneda = "10 céntimos";
          break;
        case 4:
          Moneda = "20 céntimos";
          break;
        case 5:
          Moneda = "50 céntimos";
          break;
        case 6:
          Moneda = "1 euros";
          break;
        case 7:
          Moneda = "2 euros";
          break;
      }
  
      switch (cara) {
        case 0:
          Cara = "cara";
          break;
        case 1:
          Cara = "cruz";
          break;
      }

      System.out.println(Moneda + " - " + Cara);
    }
  }
}