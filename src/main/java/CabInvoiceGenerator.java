public class CabInvoiceGenerator {
    private static  final int CostPerTime = 1;
    private  static  final double MinimumCostPerKM = 10;

    public double calculateFare (double distance, int time){
        return distance = MinimumCostPerKM + time * CostPerTime;
    }
}
