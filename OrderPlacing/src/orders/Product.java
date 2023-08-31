package orders;

public class Product {

	private int productID;
	private String productName;
	private String description;
	private String category;
	private int hsnCode;
	private String image;
	private double price;

	public Product(int productID, String productName, String description, String category, int hsnCode, String image,
			double price) {

		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.hsnCode = hsnCode;
		this.image = image;
		this.price = price;
	}

	public Product() {

	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public int getHsnCode() {
		return hsnCode;
	}

	public String getImage() {
		return image;
	}

	public double getPrice() {
		return price;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
