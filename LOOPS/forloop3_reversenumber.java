
public class forloop3_reversenumber {

    public static void main(String[] args) {

        int n = 10898;
        int remainder;
        for (int i = 1; i <= 5; i++) {
            int lastnumber = n % 10;
            n = n / 10;
            System.out.print(lastnumber);
        }

    }
}
