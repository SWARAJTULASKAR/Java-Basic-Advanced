
public class array2_addupdatemarks {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }
    }

    public static void main(String[] args) {
        int marks[] = {93, 95, 98};
        int nonChangeable = 6;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println();

    }

}
