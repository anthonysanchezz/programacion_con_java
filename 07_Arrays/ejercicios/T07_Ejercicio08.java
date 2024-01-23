/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejercicio08
 */
public class T07_Ejercicio08 {
  public static void main(String[] args) {
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    int[] temperatura = new int[12];

    for (int i = 0; i < mes.length; i++) {
      System.out.print("Introduce la temperatura media del mes de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    for (int i = 0; i < mes.length; i++) {
      System.out.printf("%12s | ", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("⬛");
      }
      System.out.println();
    }
  }
}