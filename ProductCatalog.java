package ecommerce;

public class ProductCatalog 
{
	    private int productid;
	    private String productspecification;
	    private double price;
		
	    public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public String getProductspecification() {
			return productspecification;
		}
		public void setProductspecification(String productspecification) {
			this.productspecification = productspecification;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	    	
	    public void Showdetails()
	    {
	    	// Will Display All the Product Details
	    }
	    
	    public void addtocart()
	    {
	    	//Add the Product to Cart
	    }
	

}
