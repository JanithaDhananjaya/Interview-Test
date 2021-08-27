package answers;

public class Question01 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};

        forLoop(numbers);
        whileLoop(numbers);
        int recursion = recursion(numbers, numbers.length-1);
        System.out.println("Total of Recursion : "+ recursion);
    }

    public static void forLoop(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("Total is : " + total);
    }

    public static void whileLoop(int[] numbers) {
        int total = 0;
        int size = numbers.length-1;
        while (size >= 0) {
            total += numbers[size];
            size--;
        }
        System.out.println("Total is : " + total);
    }

    public static int recursion(int[] numbers, int size) {
        {
            if (size == 0)
                return numbers[size];
            else
                return numbers[size] + recursion(numbers, size - 1);
        }
    }


}
