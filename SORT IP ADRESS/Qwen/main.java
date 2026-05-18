//SonarQube disse para remover o import Collections, troca o print por um logger, transformar a classe anonima Comparator em um lambda, 
//e ter certeza de que é seguro usar ips estaticos 
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> ipAddresses = new ArrayList<>();
        ipAddresses.add("192.168.1.2");
        ipAddresses.add("10.0.0.1");
        ipAddresses.add("192.168.1.1");
        ipAddresses.add("2001:db8::1");
        ipAddresses.add("::1");

        sortIPAddresses(ipAddresses);

        for (String ip : ipAddresses) {
            System.out.println(ip);
        }
    }

    public static void sortIPAddresses(List<String> ipList) {
        ipList.sort(new Comparator<String>() {
            @Override
            public int compare(String ip1, String ip2) {
                try {
                    InetAddress a = InetAddress.getByName(ip1);
                    InetAddress b = InetAddress.getByName(ip2);

                    byte[] aBytes = a.getAddress();
                    byte[] bBytes = b.getAddress();

                    int minLength = Math.min(aBytes.length, bBytes.length);
                    for (int i = 0; i < minLength; i++) {
                        int cmp = Byte.compare(aBytes[i], bBytes[i]);
                        if (cmp != 0) {
                            return cmp;
                        }
                    }

                    // If all bytes are equal up to the minimum length, the longer one is greater
                    return Integer.compare(aBytes.length, bBytes.length);
                } catch (Exception e) {
                    throw new IllegalArgumentException("Invalid IP address: " + ip1 + " or " + ip2, e);
                }
            }
        }
    );
    }
}
