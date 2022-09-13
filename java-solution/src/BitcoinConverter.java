import java.util.Scanner;

public class BitcoinConverter {
    private final Scanner sc = new Scanner(System.in);
    private double bitcoin;
    private double dollar;
    private double result;
    public void calculation() {
        System.out.println("What is Bitcoin price today?");
        bitcoin = sc.nextInt();
        System.out.println("How much $ do you have?");
        dollar = sc.nextInt();
        result = dollar / bitcoin;
        System.out.println("You can buy " + result + " BTC");
    }
}



