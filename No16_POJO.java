package TenToTwenty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {

	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}

public class No16_POJO {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<Product>();

		prodList.add(new Product(1, "Car"));
		prodList.add(new Product(3, "Dog"));
		prodList.add(new Product(2, "Pen"));

		Collections.sort(prodList, Comparator.comparing(Product::getProductName));

		for (Product p : prodList) {
			System.out.println("Product ID: " + p.getProductId() + ", Product Name: " + p.getProductName());
		}
	}

}
