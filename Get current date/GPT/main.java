// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateExample {

    public static void main(String[] args) {
        // Obtém a data atual do sistema
        LocalDate today = LocalDate.now();

        // Formata a data (opcional) - exemplo: 2026-05-17
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);

        System.out.println("Data atual: " + formattedDate);
    }
}
