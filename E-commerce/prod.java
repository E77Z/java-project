package e_commerce;
public abstract class prod {
 int productId; 
    String Name; 
    double price; 

    public prod(int productId, String Name, double price) {
        this.productId = productId;
        this.Name = Name;
        this.price = price;
    }
    
    public void setProductId(int productId) { 
        this.productId = productId; 
    } 
    public void setName(String name) { 
        Name = name; 
    } 
    public void setPrice(float price) { 
        this.price = price; 
    } 
    public int getProductId() { 
        if (productId>0) 
        return productId; 
        else 
        return Math.abs(productId);   
    } 
    public String getName() { 
        return Name; 
    } 
    public double getPrice() { 
        if (price>0) 
        return price; 
        else 
        return Math.abs(price); 
    }     
}
