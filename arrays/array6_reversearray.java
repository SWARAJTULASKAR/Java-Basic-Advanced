
public class array6_reversearray {

    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;

        while (first < last) {
            //sswapping
            int temp = number[last];

            number[first] = number[last];
            number[first] = temp;

            first++;
            last--;
            //return;
        }

    }
    //REVERSE ARRAY IS PRINT 

    public static void main(String[] args) {
        int number[] = {1, 4, 35, 34, 234, 4, 242, 4, 2};
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
