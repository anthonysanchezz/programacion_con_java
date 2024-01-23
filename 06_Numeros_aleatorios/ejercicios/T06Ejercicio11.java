/**
  Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
  aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
  final aparecerá el número de suspensos, el número de suficientes, el número
  de bienes, etc. 
 * 
 * @author Antonio Sánchez
 */
/**
 * T06Ejercicio11
 */
public class T06Ejercicio11 {
  public static void main(String[] args) {
    int nota = 0;
    String Nota = "";

    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;

    for (int i = 0; i < 20; i++) {
      nota = (int)(Math.random()*5);
      switch (nota) {
        case 0:
          Nota = "Suspenso";
          contadorSuspenso++;
          break;
        case 1:
          Nota = "Suficiente";
          contadorSuficiente++;
          break;
        case 2:
          Nota = "Bien";
          contadorBien++;
          break;
        case 3:
          Nota = "Notable";
          contadorNotable++;
          break;
        case 4:
          Nota = "Sobresaliente";
          contadorSobresaliente++;
          break;
      }
      System.out.println(Nota);
    }
    System.out.println("----------------");
    System.out.println("Número de suspensos: " + contadorSuspenso);
    System.out.println("Número de suficientes: " + contadorSuficiente);
    System.out.println("Número de bienes: " + contadorBien);
    System.out.println("Número de notables: " + contadorNotable);
    System.out.println("Numero de sobresaliente: " + contadorSobresaliente);
  }  
}