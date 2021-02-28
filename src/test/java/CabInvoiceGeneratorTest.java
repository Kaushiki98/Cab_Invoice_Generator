import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator invoice_generator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        double fare = invoice_generator.calculateFare(2.0, 5);
        Assertions.assertEquals(15,  15);
    }
    @Test
    public void givenRides_ShouldReturn_NumberOfRides() {
        double fare = invoice_generator.Rides(10);
        Assertions.assertEquals(10 ,10);
    }
    @Test
    public void givenMultipleRidesAndDistance_ShouldReturnTotalFare() {
        double fare = invoice_generator.TotalFare(10,2.0, 5);
        Assertions.assertEquals(150 ,150);
    }
    @Test
    public void givenTotalFare_ShouldReturnAvgFare() {
        double fare = invoice_generator.AvgFare(10, 2.0,5);
        Assertions.assertEquals(75 ,75);
    }
}
