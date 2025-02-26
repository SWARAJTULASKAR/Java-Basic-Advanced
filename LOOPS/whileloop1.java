// print 100 times hello world using while loop

public class whileloop1 {

    public static void main(String args[]) {
        int counter = 0;
        // we create a one variable counter and there value is o 

        // then we use while loop .
        while (counter <= 100) {

            // if we used while(true) ==> infinite loop is create --> only value is always true 
            System.out.println("Hello Word " + counter);
            counter++;
        }
    }
}
