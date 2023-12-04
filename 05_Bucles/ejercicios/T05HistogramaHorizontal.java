
/**
 * Histograma horizontal, sigo los pasos ofrecidos en la tarea (aproximadamente);
 * 1) Leo números hasta que sea negativo
 * 2) Los añado a la cadena de string
 * 3) Analizo cual es el mayor de ellos
 * 4) Luego los añado a la tabla, mediante la llamada a ellos buscando la posicion dentro del bucle for
 * 5) Voy añadiendo asteríscos o espacios dependiendo de lo que falte para que se rellene hasta el mayor
 * 6) Añado salto de línea para pasar al siguiente
 * 7) Por último, añado asteríscos hasta llegar al mayor
 * 
 * @author Antonio Sánchez
 */
/**
 * T05HistogramaHorizontal
 */
import java.util.Scanner;

public class T05HistogramaHorizontal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String numeros = "";                                          // Cadena de los números vacía
    int num = 0;
    int mayor = 0;
    
    System.out.println("Introduce números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si desea parar.");

    while (num >= 0 && num < 10) {
      num = sc.nextInt();                                          // Leo número hasta ser negativo => (Paso 1)

      if (num >= 0 && num <= 9) {
        numeros += num;                                            // Lo añado a la cadena => (Paso 2)
        if (num > mayor) {                                         // Si es mayor 
          mayor = num;                                             //            , lo guardo como mayor => (Paso 3)
        }
      }
    }

    for (int i = 0; i < numeros.length(); i++) {                   // Bucle que se repite tantas veces como la longitud de los números introducidos
      num = Character.getNumericValue(numeros.charAt(i));          // Accede a la posición del string y lo convierte en número => (Paso 4)

      for (int j = 0; j <= mayor; j++) {                           // Imprime línea de guiones, tantas veces como el número máximo sea___________
        System.out.print(" ---");                                //                                                                           |    
      }                                                            //                                                                           |
      System.out.print("\n");                                    // Imprime salto de línea para seguir con los números y asteriscos           |
      System.out.print("| " + num + " |");                         // Imprime el número                                                         |
      for (int j = 0; j < mayor; j++) {                            //                                                                           |--- (Paso 5)
        if (j < num) {                                             //                                                                           |
          System.out.print(" * |");                              // Imprime asteriscos tantas veces como el número indica                     |
        } else {                                                   //                                                                           |
          System.out.print("   |");                              // Después imprime tantos espacios como queden para llegar al número máximo _|
        }
      }

      System.out.print("\n");                                    // Imprime salto de línea => (Paso 6)
      
    }

    for (int i = 0; i <= mayor; i++) { 
      System.out.print(" ---");                                  //Imprime la última línea de guiones => (Paso 7)
    }
    sc.close();
  }
}