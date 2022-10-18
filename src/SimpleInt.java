import java.util.Scanner;
public class SimpleInt {
    public static void main(String args[]) {

        double SimpleInterest;
        Scanner st = new Scanner(System.in);

        System.out.println("Enter Principal balance: ");
        double P = st.nextDouble();

        System.out.println("Enter Interest Rate: ");
        double R = st.nextDouble();

        System.out.println("Enter Time Period: ");
        int T = st.nextInt();

        SimpleInterest = (P * R * T) / 100;

        System.out.println("Your Simple Interest is: " + SimpleInterest);


    }
}