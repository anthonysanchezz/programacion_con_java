/**
 * Ejemplo01
 */
/**
 * Variables primitivas
 * 
 * @author Antonio Sánchez
 */
public class Ejemplo01 {
  public static void main(String[] args) {

    // Tipo byte (8 bits, desde -128 hasta 128)
    byte miNumByte = 100;
    System.out.println(miNumByte);

    // Tipo short (16 bits, desde -32 768 hasta 32 767)
    short miNumShort = 5000;
    System.out.println(miNumShort);

    // Tipo long (64 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
    long miNumLong = 150000000L;
    System.out.println(miNumLong);

    // Tipo float (64 bits, +-1.7E-308 and +- 1.7E+308)
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    // Tipo boolean (1 bit, true o false)
    boolean esJavaDivertido = true;
    System.out.println(esJavaDivertido);

    boolean esElProfeDivertido = false;
    System.out.println(esElProfeDivertido);

    int numero = 5;

    System.out.println("El valor de la variable es " + numero);

    double x;
    double y;

    x = 7;
    y = 25.75;

    System.out.println("x vale " + x);
    System.out.println("y vale " + y);

    char letra1 = 99;
    char letra2 = 97;
    System.out.println(letra1);
    System.out.println("" + letra1 + letra2);

    // Tipo String
    String miSerie = "a";
    char miSerieA = 'a';

    System.out.println(miSerie);
    System.out.println(miSerieA);

    int num1 = 9;
    int num2 = 2;

    System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es igual a " + num1 % num2);

    int a = 2;
    int b = 9;

    double division;

    System.out.println("El casting de la variable b: " + (double) b);

    division = (double) b / (double) a;

    System.out.println(division);
  }
}