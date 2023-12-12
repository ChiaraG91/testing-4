import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void dateInfo() {
        OffsetDateTime dataTest = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, dataTest.getYear());
        assertEquals(3, dataTest.getMonthValue());
        assertEquals(1, dataTest.getDayOfMonth());
    }
}