package corejava;

public class TotalProductPrice {

	double cost;
	double tax;

	void calculateTotalPay() {
		double totalPay = cost + tax;
		System.out.println("Total Price Including Tax, the dollar amount is = " + totalPay);
	}
}
