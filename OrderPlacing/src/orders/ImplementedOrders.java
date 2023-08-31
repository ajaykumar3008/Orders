package orders;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ImplementedOrders implements OrdersDAO {

	JdbcTemplate jdbc;

	List<Product> productList = new ArrayList<>();
	List<GST> gstList = new ArrayList<>();
	List<Customer> customerList = new ArrayList<>();
	List<Address> addressList = new ArrayList<>();

	@Autowired
	public ImplementedOrders(DataSource data) {
		this.jdbc = new JdbcTemplate(data);
	}

	@Override
	public List<Product> getAllProducts() {

		productList = jdbc.query("select * from Product_x", new OrdersMapper());
		return productList;
	}

	public Product getProductByID(int productID) {

		Product product = new Product();
		for (Product p : productList) {
			if (p.getProductID() == productID) {
				product = p;
			}
		}

		return product;
	}

	@Override
	public GST getGST(int hsncode) {

		gstList = jdbc.query("select * from productGST", new GSTMapper());
		GST gst1 = new GST();
		for (GST gst : gstList) {

			if (gst.getHsncode() == hsncode) {
				gst1 = gst;
			}
		}
		return gst1;
	}

	@Override
	public Customer getCustomerByID(int custID) {

		customerList = jdbc.query("select * from customer_x", new CustomerMapper());
		Customer cr = new Customer();

		for (Customer cr1 : customerList) {
			if (cr1.getCustomerID() == custID) {
				cr = cr1;
			}
		}
		return cr;
	}

	@Override
	public Address getAddressByID(int addressID) {

		addressList = jdbc.query("select * from address_x", new AddressMapper());
		Address ar = new Address();

		for (Address ar1 : addressList) {
			if (ar1.getAddressID() == addressID) {
				ar = ar1;
			}
		}
		return ar;
	}
}
