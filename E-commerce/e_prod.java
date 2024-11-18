package e_commerce;
public class e_prod extends prod{
  String brand; 
        int warrantyPeriod; 

    public e_prod(String brand, int warrantyPeriod, int productId, String Name, double price) {
        super(productId, Name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

   
        
        public void setBrand(String brand) { 
            this.brand = brand; 
        } 
        public void setWarrantyPeriod(int warrantyPeriod) { 
            this.warrantyPeriod = warrantyPeriod; 
        } 
        public String getBrand() { 
            return brand; 
        } 
        public int getWarrantyPeriod() { 
            if (warrantyPeriod>0) 
        return warrantyPeriod; 
        else 
        return Math.abs(warrantyPeriod); 
        }     
}
