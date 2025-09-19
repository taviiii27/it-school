public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 8, 22, 19, 14, 3, 6, 10};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
