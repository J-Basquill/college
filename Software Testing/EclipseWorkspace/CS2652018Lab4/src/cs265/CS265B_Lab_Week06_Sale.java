package cs265;

public class CS265B_Lab_Week06_Sale {

	public double saleRate(int quantity, boolean cashPayment, boolean wholesale)
	{
		double discount = 0.00;
		if (quantity < 50)
			if (cashPayment && wholesale)
				discount = 0.04;
			else{
				if (cashPayment || wholesale)
					discount = 0.02;
			}
		else{
			discount = 0.04;
			if (cashPayment || wholesale)
				discount  = discount + 0.02;
		}
		return discount;
	}
	
}