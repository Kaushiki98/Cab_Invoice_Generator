import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator invoice_generator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoice_generator.calculateFare(distance, time);
        Assertions.assertEquals(15, fare, 0.0);
    }
}
