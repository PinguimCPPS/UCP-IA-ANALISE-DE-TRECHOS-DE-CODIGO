//SonarQube recomendou mudar o print por um logger e para ter certeza de que usar um IP fixo é seguro ali
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> ips = Arrays.asList(
                "192.168.1.2",
                "10.0.0.1",
                "172.16.0.5",
                "192.168.1.100",
                "8.8.8.8"
        );

        ips.sort(Comparator.comparingLong(Main::ipToLong));

        System.out.println(ips);
    }

    static long ipToLong(String ip) {

        String[] parts = ip.split("\\.");

        long result = 0;

        for (String part : parts) {
            result = result * 256 + Integer.parseInt(part);
        }

        return result;
    }
}