/**
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejercicio03
 */
public class T07_Ejercicio03 {
  public static void main(String[] args) throws InterruptedException {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
      }
    }

    //Mostramos el array
    int sumaFila = 0;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila = sumaFila + tabla[fila][columna];
        Thread.sleep(200);  
      }
      System.out.printf("|%8d\n", sumaFila);
    }

    //Mostramos la suma parcial de las columnas
    for(columna = 0; columna < 40; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaTotal = 0;
    int sumaColumna = 0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna = sumaColumna + tabla[fila][columna];
      }
      System.out.printf("%8d", sumaColumna);
    }
    
  }
}