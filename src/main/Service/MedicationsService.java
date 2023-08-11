package Service;

import java.util.List;

public interface MedicationsService {
    void searchById(String id);
    void searchByName(String name);
    void searchByCategory(String category);
}