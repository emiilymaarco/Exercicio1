import java.sql.SQLOutput;
import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Execício 1: ");
        LocalDateTime dataNasc = LocalDateTime.of(1998, 04,14, 15, 05);
        long horasAteHj = dataNasc.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        System.out.println("Segundos até hoje: " +horasAteHj );
        System.out.println();

        System.out.println("Execício 2: ");
        LocalDateTime dTPortugal = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Portugal"));
        System.out.println("Data Hora Portugal agora: " + dTPortugal);
        System.out.println();

        System.out.println("Exercício 3: ");
        ZoneOffset zone =ZoneOffset.of("-02:00");
        OffsetDateTime dataZone = OffsetDateTime.now(zone);
        System.out.println("Data e hora com fuso horario '" +zone+ "' = " +dataZone);
        System.out.println();

        System.out.println("Exercício 4: ");
        String de = "de";
        var zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow.format(DateTimeFormatter.ofPattern
                ("HH:mm:ss, d \'de\' MMMM \'de\' y (\'fuso:\' xxx)")));

    }

}
