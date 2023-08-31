package orders;

public interface PriceCalculation {

	double CalculateGST(Product p);

	Address getAddress(int custID);
}
