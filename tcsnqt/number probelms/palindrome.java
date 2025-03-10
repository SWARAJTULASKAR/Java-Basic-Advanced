
public class palindrome {

    public static void palin(int n, int dup) {
        int revNum = 0;
        int qe = n;
        int rem = 0;

        while (n > 0) {

            rem = (n % 10);
            revNum = (revNum * 10) + rem; //40
            //System.out.print(revNum); // print
            n = n / 10;
        }
        if (revNum == qe) {
            System.out.print("It is Palindrome");
        } else {
            System.out.print("It is  not palindrome");
        }

    }

    public static void main(String[] args) {
        int n = 453354;
        int dup = 0;
        palin(n, dup);

    }

}
