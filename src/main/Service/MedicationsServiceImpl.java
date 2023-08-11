package Service;

import Data.MedicationsData;

import java.util.List;

public class MedicationsServiceImpl implements MedicationsService {
    private final MedicationsData medicationsData;

    public MedicationsServiceImpl(MedicationsData medicationsData) {
        this.medicationsData = medicationsData;
    }

    @Override
    public void searchById(String id) {
        List<String[]> data = medicationsData.readDataFromCSV();

        boolean found = false;
        for (String[] row : data) {
            if (row[0].equals(id)) {
                System.out.println("Product Found:");
                printProductDetails(row);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    @Override
    public void searchByName(String name) {
        List<String[]> data = medicationsData.readDataFromCSV();

        boolean found = false;
        for (String[] row : data) {
            if (row[1].equalsIgnoreCase(name)) {
                System.out.println("Product Found:");
                printProductDetails(row);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    @Override
    public void searchByCategory(String category) {
        List<String[]> data = medicationsData.readDataFromCSV();

        boolean found = false;
        for (String[] row : data) {
            if (row[2].equalsIgnoreCase(category)) {
                System.out.println("Product Found:");
                printProductDetails(row);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    private void printProductDetails(String[] product) {
        System.out.println("ID: " + product[0]);
        System.out.println("Name: " + product[1]);
        System.out.println("Category: " + product[2]);
        System.out.println("Price: $" + product[3]);
        System.out.println("Quantity Available: " + product[4]);
        System.out.println();
    }
}
