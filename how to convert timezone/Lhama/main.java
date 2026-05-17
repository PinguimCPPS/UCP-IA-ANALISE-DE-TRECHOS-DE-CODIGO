// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static void main(String[] args) {
        // Define a data e hora no timezone de origem
        LocalDateTime datetime = LocalDateTime.of(2022, 12, 25, 12, 0, 0);
        ZoneId originZone = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdtOrigin = datetime.atZone(originZone);

        // Define o timezone de destino
        ZoneId targetZone = ZoneId.of("America/New_York");

        // Converte a data e hora para o timezone de destino
        ZonedDateTime zdtTarget = zdtOrigin.withZoneSameInstant(targetZone);

        System.out.println("Data e hora no timezone de origem: " + zdtOrigin.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Data e hora no timezone de destino: " + zdtTarget.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
