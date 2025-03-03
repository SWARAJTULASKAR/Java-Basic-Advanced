
public class array3_LinearSearch {

    // Linear Search 
    // find the value and print the address index of the location
    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {2, 4, 6, 8, 50, 12, 14, 10, 18, 20};
        int key = 10;
        int index = linearSearch(marks, key);

        if (index == -1) {
            System.out.print("Not FOund");

        } else {
            System.out.println("KEy is index address is:" + index);
        }

    }
}
