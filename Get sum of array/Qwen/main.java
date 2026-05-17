// O SonarQube aconcelhou que trocasse o System.out por Logger.

public class SumArray {
    // Método para calcular a soma de um array
    public static int sum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array não pode ser nulo");
        }
        
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Soma do array: " + sum(array));
    }
}
