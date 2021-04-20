import java.util.Random;
// Print 0-10 "Hello, "s, then a "World!" 
public class HelloAgain {
    public static void main(String[] args) {
        Random r = new Random();

        int randNum = r.nextInt(10);
        String[] helloArray = new String[randNum+1];

        for (int i = 0; i < randNum; i++) {
            helloArray[i] = "Hello, ";
        }
        helloArray[randNum] = "World!";

        for (int i = 0; i < helloArray.length; i++) {
            System.out.print(helloArray[i]);
        }
    }
}