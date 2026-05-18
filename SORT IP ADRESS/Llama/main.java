//SonarQube recomendou mudar o print por um logger
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define IP addresses
        String[] ipAddresses = {
            "192.168.1.1",
            "10.0.0.1",
            "172.16.0.1",
            "192.168.1.10",
            "10.0.0.10"
        };

        // Sort IP addresses
        Arrays.sort(ipAddresses, (a, b) -> {
            String[] partsA = a.split("\\.");
            String[] partsB = b.split("\\.");

            for (int i = 0; i < 4; i++) {
                int partA = Integer.parseInt(partsA[i]);
                int partB = Integer.parseInt(partsB[i]);

                if (partA != partB) {
                    return Integer.compare(partA, partB);
                }
            }

            return 0;
        });

        // Print sorted IP addresses
        System.out.println("Sorted IP addresses:");
        for (String ipAddress : ipAddresses) {
            System.out.println(ipAddress);
        }
    }
}