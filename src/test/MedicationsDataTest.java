import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicationsDataTest {

    private MedicationsData medicationsData;

    @BeforeEach
    public void setUp() {
        medicationsData = Mockito.mock(MedicationsData.class);
    }

    @Test
    public void testReadDataFromCSV() {
        List<String[]> mockData = new ArrayList<>();
        mockData.add(new String[]{"123", "Medicine A", "Category A"});
        mockData.add(new String[]{"456", "Medicine B", "Category B"});

        Mockito.when(medicationsData.readDataFromCSV()).thenReturn(mockData);

        List<String[]> result = medicationsData.readDataFromCSV();

        assertEquals(mockData, result);
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"123", "Medicine A", "Category A"}, result.get(0));
        assertArrayEquals(new String[]{"456", "Medicine B", "Category B"}, result.get(1));
    }

}