
// break statement used for go to out of loop
public class breakstatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.print("i am out of loop");
    }
}
