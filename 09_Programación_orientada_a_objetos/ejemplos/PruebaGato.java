public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato("Garfield");
    // garfield.sexo = "macho";
    // Gato botas = new Gato("Botas", "Negro", "Siames", "macho", 5, 3.2);

    // String comida;
    // System.out.println("Que quieres que coma el gato?");
    // comida = System.console().readLine();

    // garfield.come(comida);
    // garfield.maulla();
    // garfield.peleaCon(botas);
    
    System.out.print("¿Cuantos gatos quieres crear? ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[num];
    String[] nombres = {"Garfield", "Botas", "Willy", "Pancho", "Misifú"};
    String[] colores = {"Negro", "Marrón", "Pardo"};
    
    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("¿Qué raza deseas? ");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "macho", 0, 0);
    }
    
    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
      System.out.println(gaticos[i].raza);
    }
  }
}
