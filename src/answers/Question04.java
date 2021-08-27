package answers;

import java.util.Arrays;

public class Question04 {
    public static void main(String[] args) {
        int[] array = {50, 2, 1, 9};
        int size = array.length;

        Arrays.sort(array);

        int num = array[0];

        // generate the number
        for(int i = size - 1; i >= 0; i--)
        {
            num = num * 10 + array[i];
        }

        System.out.println(num);
    }
}
