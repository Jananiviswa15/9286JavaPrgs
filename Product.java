package HQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	public Integer getProductId() {
		return productId;
	}
	
	@Column(name = "productName")
	private String proName;
	private double price;

		public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}

	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
}