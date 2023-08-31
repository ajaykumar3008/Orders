package orders;

import org.springframework.beans.factory.annotation.Autowired;

public class PriceImplemented implements PriceCalculation {

	ImplementedOrders impOrder;

	@Autowired
	public PriceImplemented(ImplementedOrders imp) {
		this.impOrder = imp;
	}

	@Override
	public double CalculateGST(Product p) {

		GST gst = impOrder.getGST(p.getHsnCode());
		double gstPrice = (p.getPrice() / 100) * gst.getGst();

		return gstPrice;
	}

	@Override
	public Address getAddress(int custID) {

		Customer cr = impOrder.getCustomerByID(custID);

		Address addr = impOrder.getAddressByID(cr.getAddressID());

		return addr;
	}

}
