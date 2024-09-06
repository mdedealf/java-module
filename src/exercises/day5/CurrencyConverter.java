package exercises.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    double amountOfMoney;
    String sourceCurrency;
    String targetCurrency;

    public CurrencyConverter(double amountOfMoney, String sourceCurrency, String targetCurrency) {
        this.amountOfMoney = amountOfMoney;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public static void runCurrencyConverter() {
        Scanner sc = new Scanner(System.in);

        // Input the amount of money that want to convert
        System.out.print("Enter the amount of money : ");
        double amountOfMoney = sc.nextDouble();
        // Input the source of currency
        System.out.print("Enter the source of currency (USD, EUR, GBP, JPY) : ");
        String sourceCurrency = sc.next().toUpperCase();
        // Input the target of currency to convert
        System.out.print("Enter the source of currency (USD, EUR, GBP, JPY) : ");
        String targetCurrency = sc.next().toUpperCase();

        // Initialize a HashMap to store data exchanges rate
        Map<String, Double> listOfExchanges = new HashMap<>();

        // Adding some exchanges rates library
        listOfExchanges.put("USD", 1.0);
        listOfExchanges.put("EUR", 0.92);
        listOfExchanges.put("GBP", 0.79);
        listOfExchanges.put("JPY", 147.65);

        // Check if the entered source and target currency are exist in the library
        if(listOfExchanges.containsKey(sourceCurrency) && listOfExchanges.containsKey(targetCurrency)) {
            // If both source and target are exist, first convert the amount of money to source currency
            double amountOfSourceMoney =  amountOfMoney / listOfExchanges.get(sourceCurrency);

            // Convert the source to target currency
            double amountOfTargetMoney = amountOfSourceMoney * listOfExchanges.get(targetCurrency);

            System.out.println(amountOfMoney + " " + sourceCurrency + " is equal to " + amountOfTargetMoney + " " + targetCurrency);
        } else System.out.println("Please enter the correct currency! ");

        // initialize class object and give some parameters
        CurrencyConverter currencyConverter = new CurrencyConverter(amountOfMoney, sourceCurrency, targetCurrency);

    }

}


