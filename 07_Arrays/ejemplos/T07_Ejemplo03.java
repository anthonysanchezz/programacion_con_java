/**
 * Ejemplo 3 de arrays
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejemplo03
 */
public class T07_Ejemplo03 {
  public static void main(String[] args) {
    int[] num = new int[10];

    num[0] = 8;
    num[1] = 33;
    num[2] = 200;
    num[3] = 150;
    num[4] = 11;
    num[5] = 88;
    num[6] = num[2] * 10;                   // 2000
    num[7] = num[2] / 10;                   // 20
    num[8] = num[0] + num[1] + num[2];      // 241
    num[9] = num[8];                        // 241

    System.out.print("Los valores del array n son los siguientes: ");

    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}