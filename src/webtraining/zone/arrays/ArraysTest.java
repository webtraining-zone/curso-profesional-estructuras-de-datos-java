package webtraining.zone.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        // Primitive types
        // byte, short, int, long, float, double, char, boolean
        // 0-9
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * i;
        }

        // foreach
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}