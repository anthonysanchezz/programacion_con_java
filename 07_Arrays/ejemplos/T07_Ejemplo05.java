/**
 * Se muestra un array de números de tipo double que almacenan notas de alumnos
 * 
 * @author Antonio Sánchez
 */
/**
 * T07_Ejemplo05
 */
public class T07_Ejemplo05 {
  public static void main(String[] args) {
    double[] notas = new double[3];
    double media = 0;
    double suma = 0;

    // Escritura en el array
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    // Lectura del array
    System.out.println("Tus notas son: ");
    for (int i = 0; i < notas.length; i++) {
      System.out.print(notas[i] + "\t");
      suma += notas[i];
    }

    media = suma / notas.length;
    System.out.printf("\nLa media de tus notas es un %.2f" , media);
  }  
}