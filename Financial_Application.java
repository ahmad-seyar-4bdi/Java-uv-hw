
package financial_application;

public class Financial_Application {

    public static double computeCommission(double salesAmount) {

        double commission = 0;

        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } 
        else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 +
                        (salesAmount - 5000) * 0.10;
        } 
        else {
            commission = 5000 * 0.08 +
                        5000 * 0.10 +
                        (salesAmount - 10000) * 0.12;
        }

        return commission;
    }

    public static void main(String[] args) {

        System.out.println("Sales Amount\tCommission");

        for (int sales = 10000; sales <= 100000; sales += 5000) {
            double commission = computeCommission(sales);
            System.out.println(sales + "\t\t" + commission);
        }
    }

}
