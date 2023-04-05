import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AxisFund axis = new AxisFund();
        ParagParikhFund parag = new ParagParikhFund();


        int value;
        do {
            System.out.println("Enter 1 - Parag Parikh Mututal Fund's Schemes");
            System.out.println("Enter 2 - Axis Bank Mutual Fund's Schemes");
            System.out.println("Enter 3 - Exit \n");
            value = scanner.nextInt();
            switch (value) {
                case 1:
                    parag.smallCapFund();
                    parag.technologyFund();
                    System.out.println("---------------");
                    break;
                case 2:
                    axis.smallCapFund();
                    axis.technologyFund();
                    System.out.println("---------------");
                    break;
                case 3:
                    System.out.println("Keep investing !");
                    break;

            }
        } while (value != 3);

    }
}