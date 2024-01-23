/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo. 
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejercicio06bidi
 */
public class T07_Ejercicio06bidi {
  public static void main(String[] args) {
    int[][] num = new int[6][10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int ejeXmax = 0;
    int ejeYmax = 0;
    int ejeXmin = 0;
    int ejeYmin = 0;
    boolean esRepetido = false;

    for (int i = 0; i < num.length; i++) {
      System.out.printf("%6d", (i + 1));
      System.out.print(" |");
      for (int j = 0; j < num[i].length; j++) {
        do {
          num[i][j] = (int)(Math.random()*60);
          esRepetido = false;
          for (int l = 0; l < 10 * i + j; l++) {
            if (num[i][j] == num[i / 10][i % 10]) {
              esRepetido = true;
            }
          }
        } while (esRepetido);
        
        if (num[i][j] > maximo) {
          maximo = num[i][j];
          ejeXmax = i;
          ejeYmax = j;
        }
        if (num[i][j] < minimo) {
          minimo = num[i][j];
          ejeXmin = i;
          ejeYmin = j;
        }
        System.out.printf("%6d", num[i][j]);
      }
      System.out.println();
    }
    System.out.print("        ");

    for (int i = 0; i < num[0].length; i++) {
      System.out.print("------");
    }

    System.out.print("\n       ");

    for (int i = 0; i < num[0].length; i++) {
      System.out.printf("%6d", (i + 1));
    }
    System.out.println("\nEl mínimo es " + minimo + " y está en la fila " + (ejeXmin + 1) + " y columna " + (ejeYmin + 1));
    System.out.println("\nEl máximo es " + maximo + " y está en la fila " + (ejeXmax + 1) + " y columna " + (ejeYmax + 1));
  }
}