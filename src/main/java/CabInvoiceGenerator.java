import java.util.Scanner;

public class CabInvoiceGenerator {
    private static  final int CostPerTime = 1;
    private  static  final double MinimumCostPerKM = 10;
    public double totalFare , avgFare;

    public double calculateFare (double distance, int time) {
        distance = MinimumCostPerKM + time * CostPerTime;
        return distance;
    }

    public double Rides(int numOfRides){
        return numOfRides;
    }
    public double TotalFare(int numOfRides, double distance, int time) {
        totalFare = ( MinimumCostPerKM + time * CostPerTime / distance ) * numOfRides;
        return totalFare;
    }

    public double AvgFare(int numOfRides, double distance, int time ) {
        totalFare = (MinimumCostPerKM + time * CostPerTime / distance) * numOfRides;
        avgFare = totalFare / 2;
        return avgFare;
    }
}
