import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator invoice_generator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoice_generator.calculateFare(distance, time);
        Assertions.assertEquals(15,  15);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        double fare = invoice_generator.multipleRides(10);
        Assertions.assertEquals(150 ,150);
    }
}
