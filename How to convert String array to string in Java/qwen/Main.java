// SonarQube não disse nada
import java.util.Arrays;
import java.util.stream.Collectors;

String[] arr = {"Java", "is", "cool"};
String result = Arrays.stream(arr)
                      .collect(Collectors.joining(" "));  // "Java is cool"
String result2 = Arrays.stream(arr)
                       .collect(Collectors.joining());    // "Javaiscool"