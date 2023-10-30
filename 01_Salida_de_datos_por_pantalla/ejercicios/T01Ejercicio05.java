
/**
 * T01Ejercicio05
 */
/**
 * Imprime el horario de clases con color para cada clase
 * 
 * @author Antonio Sánchez
 */
import colors.ConsoleColors;

public class T01Ejercicio05 {

    public static void main(String[] args) {

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "Horas", "Lunes", "Martes", "Miércoles", "Jueves",
                "Viernes");

        System.out.printf("%-10s %-5s %-10s %-10s %-10s %s\n", "15:15", "\033[0;35mFOL\033[0;49m",
                "\033[0;31mPROGR\033[0;49m", "\033[0;33mENDES\033[0;49m", "\033[0;34mBADAT\033[0;49m",
                "\033[0;31mPROGR\033[0;49m");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "16:15", "\033[0;35mFOL\033[0;49m",
                "\033[0;31mPROGR\033[0;49m", "\033[0;33mENDES\033[0;49m", "\033[0;34mBADAT\033[0;49m",
                "\033[0;31mPROGR\033[0;49m");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "17:15", "\033[0;35mFOL\033[0;49m",
                "\033[0;34mBADAT\033[0;49m", "\033[0;34mBADAT\033[0;49m", "\033[0;32mLMSGI\033[0;49m",
                "\033[0;33mENDES\033[0;49m");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "18:30", "\033[0;36mSIINF\033[0;49m",
                "\033[0;34mBADAT\033[0;49m", "\033[0;34mBADAT\033[0;49m", "\033[0;32mLMSGI\033[0;49m",
                "\033[0;36mSIINF\033[0;49m");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "19:30", "\033[0;36mSIINF\033[0;49m",
                "\033[0;32mLMSGI\033[0;49m", "\033[0;31mPROGR\033[0;49m", "\033[0;31mPROGR\033[0;49m",
                "\033[0;36mSIINF\033[0;49m");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n", "20:30", "\033[0;36mSIINF\033[0;49m",
                "\033[0;32mLMSGI\033[0;49m", "\033[0;31mPROGR\033[0;49m", "\033[0;31mPROGR\033[0;49m",
                "\033[0;36mSIINF\033[0;49m");
    }
}