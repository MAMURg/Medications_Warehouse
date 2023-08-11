import Controller.MedicationsController;
import Data.MedicationsData;
import Data.MedicationsDataImpl;
import Service.MedicationsService;
import Service.MedicationsServiceImpl;

public class View {
    public static void main(String[] args) {
        System.out.println("=== Medications ===");
        System.out.println(" Welcome to Medications Warehouse ");
        System.out.println("Version 2.0 created date-2023.06.10");
        System.out.println("Contact: \nName - Mamurjon Turdikulov \nemail - turdikulovmamur@gmail.com");
        MedicationsData medicationsData = new MedicationsDataImpl();
        MedicationsService medicationsService = new MedicationsServiceImpl(medicationsData);
        MedicationsController medicationsController = new MedicationsController(medicationsService);
        medicationsController.searchProducts();
    }
}