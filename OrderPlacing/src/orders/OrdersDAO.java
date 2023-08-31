package orders;

import java.util.List;

public interface OrdersDAO {

	List<Product> getAllProducts();

	Product getProductByID(int productID);

	GST getGST(int hsncode);

	Customer getCustomerByID(int custID);

	Address getAddressByID(int addressID);

}
