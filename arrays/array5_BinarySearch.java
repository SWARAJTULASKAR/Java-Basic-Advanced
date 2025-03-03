
public class array5_BinarySearch {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comapre 
            if (numbers[mid] == key) {
                return mid;

            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 50, 12, 14, 10, 18, 20};
        int key = 4;

        System.out.print(BinarySearch(numbers, key));

    }
}
