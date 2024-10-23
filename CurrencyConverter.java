import java.util.Scanner;

class CurrencyConverter {

    private static double eurRateToUsd = 1.08;
    private static double eurRateToInr = 90.70;
    private static double usdRateToEur = 0.92;
    private static double usdRateToInr = 83.30;
    private static double inrRateToUsd = 0.012;
    private static double inrRateToEur = 0.011;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");

        // Choice for user
        while (true) {

            System.out.println("Choose 1 to convert USD to INR.");
            System.out.println("Choose 2 to convert INR to USD.");
            System.out.println("Choose 3 to convert EUR to INR.");
            System.out.println("Choose 4 to convert INR to EUR.");
            System.out.println("Choose 5 to convert EUR to USD.");
            System.out.println("Choose 6 to convert USD to EUR.");
            System.out.println("Choose 0 to exit.");

            // Input for user choice
            System.out.println("Please enter your choice:");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    convertUSDTOINR(sc);
                    break;
                case 2:
                    convertINRTOUSD(sc);
                    break;
                case 3:
                    convertEURTOINR(sc);
                    break;
                case 4:
                    convertINRTOEUR(sc);
                    break;
                case 5:
                    convertEURTOUSD(sc);
                    break;
                case 6:
                    convertUSDTOEUR(sc);
                    break;
                case 0:
                    System.out.println("THANK YOU.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to convert USD to INR
    private static void convertUSDTOINR(Scanner sc) {
        System.out.println("Enter amount in USD:");
        double usdAmount = sc.nextDouble();
        double inrAmount = usdAmount * usdRateToInr;
        System.out.println(usdAmount + " USD = " + inrAmount + " INR");
    }

    // Method to convert INR to USD
    private static void convertINRTOUSD(Scanner sc) {
        System.out.println("Enter amount in INR:");
        double inrAmount = sc.nextDouble();
        double usdAmount = inrAmount * inrRateToUsd;
        System.out.println(inrAmount + " INR = " + usdAmount + " USD");
    }

    // Method to convert EUR to INR
    private static void convertEURTOINR(Scanner sc) {
        System.out.println("Enter amount in EUR:");
        double eurAmount = sc.nextDouble();
        double inrAmount = eurAmount * eurRateToInr;
        System.out.println(eurAmount + " EUR = " + inrAmount + " INR");
    }

    // Method to convert INR to EUR
    private static void convertINRTOEUR(Scanner sc) {
        System.out.println("Enter amount in INR:");
        double inrAmount = sc.nextDouble();
        double eurAmount = inrAmount * inrRateToEur;
        System.out.println(inrAmount + " INR = " + eurAmount + " EUR");
    }

    // Method to convert EUR to USD
    private static void convertEURTOUSD(Scanner sc) {
        System.out.println("Enter amount in EUR:");
        double eurAmount = sc.nextDouble();
        double usdAmount = eurAmount * eurRateToUsd;
        System.out.println(eurAmount + " EUR = " + usdAmount + " USD");
    }

    // Method to convert USD to EUR
    private static void convertUSDTOEUR(Scanner sc) {
        System.out.println("Enter amount in USD:");
        double usdAmount = sc.nextDouble();
        double eurAmount = usdAmount * usdRateToEur;
        System.out.println(usdAmount + " USD = " + eurAmount + " EUR");
    }
}
