/**
 * Crea la clase gato
 * 
 * @author Antonio Sánchez
 */
public class Gato {

  // Atributos
  String raza;
  String nombre;
  String color;
  String sexo;
  int edad;
  double peso;

  // Constructores

  Gato(String nombre) {
    this.nombre = nombre;
    this.color = "Azul";
    this.raza = "Siames";
  }

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
  }

  // Métodos
  void maulla() {                           // void no devuelve ningun valor
    System.out.println("Miaaaaaaaau!");     
  }

  void ronroneaa() {
    System.out.println("Brrrrrrrr");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Ñam ñam!");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

  void peleaCon(Gato contrincante) {
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aquí, que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }
}