/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio27
 */
public class T04Ejercicio27 {
  public static void main(String[] args) {
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = System.console().readLine();

    double precioSabor = 0;
    String chocolate = "chocolate";
    double precioNata = 0;
    double precioNombre = 0;

    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        chocolate = System.console().readLine();
        switch (chocolate) {
          case "negro":
            precioSabor = 14;
            break;
          case "blanco":
            precioSabor = 15;
            break;
          default:
            break;
        }
        break;
      default:
        break;
    }
    System.out.print("¿Quiere nata? (si o no): ");
    String nata = System.console().readLine();

    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = System.console().readLine();

    if (sabor == "chocolate") {
      System.out.print("Tarta de " + sabor + " " + chocolate + ": ");
      System.out.printf("%.2f €\n", precioSabor);
    } else {
      System.out.print("Tarta de " + sabor + ": ");
      System.out.printf("%.2f €\n", precioSabor);
    }

    if (nata.equals("si")) {
      System.out.println("Con nata: 2,50 €");
      precioNata = 2.5;
    }

    if (nombre.equals("si")) {
      System.out.println("Con nombre: 2,75 €");
      precioNombre = 2.75;
    }

    double precioTotal = precioSabor + precioNata + precioNombre;

    System.out.print("Total: ");
    System.out.printf("%.2f €", precioTotal);
  }
}