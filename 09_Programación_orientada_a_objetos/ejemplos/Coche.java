/**
 * Crea la clase Coche
 * 
 * @author Antonio Sánchez
 */
public class Coche {
  
  // Atributos
  String matricula;
  String modelo;
  String marca;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();      // Coche 1
    Coche tuCoche = new Coche();      // Coche 2

    miCoche.matricula = "MA 6905 BL";   // Asignación de valor a un atributo

    System.out.println("Matrícula del coche 1: " + miCoche.matricula);
    // objeto.atributo da el valor del atributo de ese objeto
    System.out.println("Potencia del coche 1: " + miCoche.potencia);
    System.out.println("Matrícula del coche 2: " + tuCoche.matricula);
    System.out.println("Potencia del coche 2: " + tuCoche.potencia);
  }
}
