// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static void main(String[] args) {
        // Data/hora original em formato String
        String dateTimeStr = "2023-10-25 15:30:00";
        
        // Formato da data/hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Converte a String para LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        
        // Define o fuso horário de origem e destino
        ZoneId sourceZone = ZoneId.of("America/Sao_Paulo");
        ZoneId targetZone = ZoneId.of("Europe/London");
        
        // Converte para ZonedDateTime no fuso de origem
        ZonedDateTime sourceDateTime = ZonedDateTime.of(localDateTime, sourceZone);
        
        // Converte para o fuso de destino
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);
        
        // Exibe os resultados
        System.out.println("Original (UTC-3): " + sourceDateTime.format(formatter));
        System.out.println("Convertido (UTC+1): " + targetDateTime.format(formatter));
    }
}
