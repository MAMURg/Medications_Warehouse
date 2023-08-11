package Controller;

import Service.MedicationsService;
import Service.MedicationsService;

import java.util.Scanner;

public class MedicationsController {
    private final MedicationsService medicationsService;

    public MedicationsController(MedicationsService medicationsService) {
        this.medicationsService = medicationsService;
    }

    public void searchProducts() {
        Scanner scanner = new Scanner(System.in);
        String preferredType = "";

        while (!preferredType.equals("exit")) {
            System.out.print("Enter the preferred search type (Id, Name, Category), or 'exit' to quit: ");
            preferredType = scanner.nextLine();

            if (preferredType.equalsIgnoreCase("Id")) {
                System.out.print("Enter the product ID: ");
                String id = scanner.nextLine();
                medicationsService.searchById(id);
            } 
            else if (preferredType.equalsIgnoreCase("Name")) {
                System.out.print("Enter the product name: ");
                String name = scanner.nextLine();
                medicationsService.searchByName(name);
            } 
            else if (preferredType.equalsIgnoreCase("Category")) {
                System.out.print("Enter the product category: ");
                String category = scanner.nextLine();
                medicationsService.searchByCategory(category);
            } 
            else if (!preferredType.equalsIgnoreCase("exit")) {
                System.out.println("Invalid search type. Please try again.");
            }
        }}}