public class CabInvoiceGenerator {
    private static  final int CostPerTime = 1;
    private  static  final double MinimumCostPerKM = 10;
    public double distance;

    public double calculateFare (double distance, int time){
        distance = MinimumCostPerKM + time * CostPerTime;
        return distance;
    }

    public double multipleRides (int numOfRides){
        double total = distance * numOfRides;
        return total;
    }
}
