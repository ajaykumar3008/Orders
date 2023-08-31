package orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrdersController {

	OrdersDAO orders;
	PriceCalculation priceCal;

	@Autowired
	public OrdersController(OrdersDAO orders, PriceCalculation priceCal) {
		this.orders = orders;
		this.priceCal = priceCal;
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(Model mod) {

		List<Product> ls = orders.getAllProducts();
		mod.addAttribute("productList", ls);
		return "cart";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(@RequestParam("productID") String id, Model mod) {

		int productId = Integer.parseInt(id);
		mod.addAttribute("product", orders.getProductByID(productId));
		return "product";
	}

	@RequestMapping(value = "/placeorder", method = RequestMethod.GET)
	public String orderPlacing(@RequestParam("productID") String id, @RequestParam("custID") String custid, Model mod) {

		int productId = Integer.parseInt(id);
		int customerID = Integer.parseInt(custid);
		Product p = orders.getProductByID(productId);
		mod.addAttribute("address", priceCal.getAddress(customerID));
		mod.addAttribute("gst", priceCal.CalculateGST(p));
		mod.addAttribute("product", p);
		return "buying";
	}
}
