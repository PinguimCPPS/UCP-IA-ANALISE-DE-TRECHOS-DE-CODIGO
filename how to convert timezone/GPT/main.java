// O SonarQube aconcelhou que trocasse o System.out por Logger.

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {

    /**
     * Converts a date‑time string from the source time‑zone to the target time‑zone.
     *
     * @param sourceDateTime the date‑time in the source zone (e.g. "2026-05-17T14:30")
     * @param sourceZoneId   the source zone id (e.g. "America/New_York")
     * @param targetZoneId   the target zone id (e.g. "Asia/Tokyo")
     * @return the formatted date‑time in the target zone
     */
    public static String convert(String sourceDateTime,
                                 String sourceZoneId,
                                 String targetZoneId) {

        // Parse the input as a local date‑time (no zone information yet)
        ZonedDateTime sourceZdt = ZonedDateTime.of(
                java.time.LocalDateTime.parse(sourceDateTime),
                ZoneId.of(sourceZoneId));

        // Convert to the target zone, preserving the instant in time
        ZonedDateTime targetZdt = sourceZdt.withZoneSameInstant(ZoneId.of(targetZoneId));

        // Return a readable representation
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        return targetZdt.format(fmt);
    }

    public static void main(String[] args) {
        // Example: 2026-05-17 14:30 in New York → Tokyo
        String source = "2026-05-17T14:30:00";
        String sourceZone = "America/New_York";
        String targetZone = "Asia/Tokyo";

        String result = convert(source, sourceZone, targetZone);
        System.out.println("Converted time: " + result);
        // Output: Converted time: 2026-05-18 03:30:00 JST
    }
}
