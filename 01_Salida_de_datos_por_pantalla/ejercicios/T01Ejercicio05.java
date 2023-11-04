
/**
 * Imprime mi horario con colores 
 * 
 * @author Antonio Sánchez
 */
import colors.ConsoleColors;

public class T01Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Hora   LUNES    MARTES    MIERCOLES   JUEVES   VIERNES");
        System.out
                .println("15:15  " + ConsoleColors.PURPLE + "FOL     " + ConsoleColors.RED + " PROGR    "
                        + ConsoleColors.YELLOW
                        + " ENDES     " + ConsoleColors.BLUE + "  BADAT    " + ConsoleColors.RED + "PROGR");
        System.out
                .println(ConsoleColors.WHITE + "16:15  " + ConsoleColors.PURPLE + "FOL     " + ConsoleColors.RED
                        + " PROGR    "
                        + ConsoleColors.YELLOW
                        + " ENDES     " + ConsoleColors.BLUE + "  BADAT    " + ConsoleColors.RED + "PROGR");
        System.out
                .println(ConsoleColors.WHITE + "17:15  " + ConsoleColors.PURPLE + "FOL     " + ConsoleColors.BLUE
                        + " BADAT    "
                        + ConsoleColors.BLUE
                        + " BADAT     " + ConsoleColors.GREEN + "  LMSGI    " + ConsoleColors.YELLOW + "ENDES");
        System.out
                .println(ConsoleColors.WHITE + "18:30  " + ConsoleColors.CYAN + "SIINF   " + ConsoleColors.BLUE
                        + " BADAT    "
                        + ConsoleColors.BLUE
                        + " BADAT     " + ConsoleColors.GREEN + "  LMSGI    " + ConsoleColors.CYAN + "SIINF");
        System.out
                .println(ConsoleColors.WHITE + "19:30  " + ConsoleColors.CYAN + "SIINF   " + ConsoleColors.GREEN
                        + " LMSGI    "
                        + ConsoleColors.RED
                        + " PROGR     " + ConsoleColors.RED + "  PROGR    " + ConsoleColors.CYAN + "SIINF");
        System.out
                .println(ConsoleColors.WHITE + "20:30  " + ConsoleColors.CYAN + "SIINF   " + ConsoleColors.GREEN
                        + " LMSGI    "
                        + ConsoleColors.RED
                        + " PROGR     " + ConsoleColors.RED + "  PROGR    " + ConsoleColors.CYAN + "SIINF");
    }
}