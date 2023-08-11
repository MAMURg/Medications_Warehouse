import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ViewTest {
    
    private MedicationsController mockController;
    
    @BeforeEach
    public void setUp() {
        MedicationsService mockService = Mockito.mock(MedicationsService.class);
        mockController = new MedicationsController(mockService);
    }
    
    @Test
    public void testSearchProducts() {
        
        Mockito.when(mockController.searchProducts()).thenReturn("Mocked Result");
        
        String result = mockController.searchProducts();
        
        assertEquals("Mocked Result", result);
       
    }
    
}