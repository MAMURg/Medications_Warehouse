import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MedicationsControllerTest {

    private MedicationsService mockService;
    private MedicationsController medicationsController;

    @BeforeEach
    public void setUp() {
        mockService = Mockito.mock(MedicationsService.class);
        medicationsController = new MedicationsController(mockService);
    }

    @Test
    public void testSearchProducts_Id() {
        String input = "Id\n123\nexit\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        medicationsController.searchProducts();

        Mockito.verify(mockService).searchById("123");
    }

    @Test
    public void testSearchProducts_Name() {
        String input = "Name\nMedicineName\nexit\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        medicationsController.searchProducts();

        Mockito.verify(mockService).searchByName("MedicineName");
    }

    @Test
    public void testSearchProducts_Category() {
        String input = "Category\nCategoryName\nexit\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        medicationsController.searchProducts();

        Mockito.verify(mockService).searchByCategory("CategoryName");
    }

}
