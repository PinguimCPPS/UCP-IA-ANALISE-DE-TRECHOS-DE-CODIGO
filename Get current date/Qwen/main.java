// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.time.LocalDate;

public class CurrentDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
    }
}
