import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MedicationsServiceTest {

    private MedicationsService medicationsService;

    @BeforeEach
    public void setUp() {
        medicationsService = Mockito.mock(MedicationsService.class);
    }

    @Test
    public void testSearchById() {
        Mockito.doNothing().when(medicationsService).searchById(Mockito.anyString());

        medicationsService.searchById("123");

        Mockito.verify(medicationsService).searchById("123");
    }

    @Test
    public void testSearchByName() {
        Mockito.doNothing().when(medicationsService).searchByName(Mockito.anyString());

        medicationsService.searchByName("Medicine A");

        Mockito.verify(medicationsService).searchByName("Medicine A");
    }

    @Test
    public void testSearchByCategory() {
        Mockito.doNothing().when(medicationsService).searchByCategory(Mockito.anyString());

        medicationsService.searchByCategory("Category A");

        Mockito.verify(medicationsService).searchByCategory("Category A");
    }

}
