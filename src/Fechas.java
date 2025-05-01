import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) throws Exception {

        
        LocalDate fecha = LocalDate.now();
        LocalDate fechaUsuario = LocalDate.of(2022,05,19);
        int anioActual= fecha.getYear();
        int mesActual= fecha.getMonthValue();
        int diaActual= fecha.getDayOfMonth();
        System.out.println( mesActual + "/" + diaActual+ "/"  + anioActual);
        System.out.println(fechaUsuario);
    }

}
