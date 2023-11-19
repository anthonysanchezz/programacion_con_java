
/**
 * Imprime nomina de empleado segun puesto, dietas y estado civil
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio24
 */
import java.util.Scanner;

public class T04Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");

    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = sc.nextInt();

    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasViaje = sc.nextInt();

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = sc.nextInt();

    double sueldoBase = 0;
    double dietas = diasViaje * 50;
    int retencionIRPF = 0;

    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
        break;
    }

    switch (estadoCivil) {
      case 1:
        retencionIRPF = 20;
        break;
      case 2:
        retencionIRPF = 25;
        break;
      default:
        break;
    }

    double irpf = ((sueldoBase + dietas) * 20) / 100;
    double sueldoBruto = sueldoBase + dietas;
    double sueldoNeto = sueldoBruto - irpf;

    System.out.println("----------------------------------");
    System.out.printf("| Sueldo base            %7.2f |\n", sueldoBase);
    System.out.printf("| Dietas (%d viajes)      %7.2f |\n", diasViaje, dietas);
    System.out.println("|--------------------------------|");
    System.out.printf("| Sueldo bruto           %7.2f |\n", sueldoBruto);
    System.out.printf("| Retencion IRPF (%d %%)   %6.2f |\n", retencionIRPF, irpf);
    System.out.println("|--------------------------------|");
    System.out.printf("| Sueldo neto            %7.2f |\n", sueldoNeto);
    System.out.println("----------------------------------");

    sc.close();
  }
}