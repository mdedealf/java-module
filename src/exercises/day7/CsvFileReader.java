package exercises.day7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {

    private static String[] extractCsvFile() {
        String FILE_PATH = "D:\\Bootcamp\\learn-java\\src\\resources\\product_sales_data.csv";
        String line = "";
        String headers = "Product Name,Total Sold,Item Price";

        ArrayList<String> csvData = new ArrayList<>();

        try {
            // works same like using Scanner
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));

            // store header row data to skip it added into arrayList
            String checkHeaders = br.readLine();

            if(headers == null || !headers.equalsIgnoreCase(checkHeaders)) {
                throw new IllegalArgumentException("Something went wrong: Invalid CSV file format");
            }

            // while next line not null store the line by line data
            while ((line = br.readLine()) != null) {
                csvData.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File / path is not found.");
        } catch (IOException e) {
            System.out.println("Something wrong with IO");
        } catch (NumberFormatException e) {
            System.out.println("Some data have invalid format.");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return csvData.toArray(new String[0]); // return into 0 dimension array
    }

    public static List[] processCsvData() {
        String[] csvData = extractCsvFile();
        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Integer> totalSold = new ArrayList<>();
        ArrayList<Double> itemPrice = new ArrayList<>();

        for (String data : csvData) {
            String[] tempData = data.split(",");
            productName.add(tempData[0]);
            totalSold.add(Integer.parseInt(tempData[1]));
            itemPrice.add(Double.parseDouble(tempData[2]));
        }

        return new List[]{productName, totalSold, itemPrice};
    }

    public double totalSales(List<Integer> totalSold, List<Double> itemPrice) {
        double countTotalSales = 0;

        for (int i = 0; i < totalSold.size(); i++) countTotalSales += totalSold.get(i) * itemPrice.get(i);
        return countTotalSales;
    }

    public int totalSold(List<Integer> totalSold) {
        int countTotalSold = 0;

        for (int data : totalSold) countTotalSold += data;
        return countTotalSold;
    }

    public String mostBoughtProduct(List<Integer> totalSold, List<String> productName) {
        int maxSold = Integer.MIN_VALUE;
        int productIndex = 0;

        for (int i = 0; i < totalSold.size(); i++) {
            if (totalSold.get(i) > maxSold) {
                maxSold = totalSold.get(i);
                productIndex = i;
            }
        }
        return productName.get(productIndex);
    }

    public String leastBoughtProduct(List<Integer> totalSold, List<String> productName) {
        int minSold = Integer.MAX_VALUE;
        int productIndex = 0;

        for (int i = 0; i < totalSold.size(); i++) {
            if (totalSold.get(i) < minSold) {
                minSold = totalSold.get(i);
                productIndex = i;
            }
        }
        return productName.get(productIndex);
    }
}
