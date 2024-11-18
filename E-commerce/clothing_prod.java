package e_commerce;
public class clothing_prod extends prod {
 String size; 
        String fabric; 

    public clothing_prod(String size, String fabric, int productId, String Name, double price) {
        super(productId, Name, price);
        this.size = size;
        this.fabric = fabric;
    }
        
        public void setSize(String size) { 
            this.size = size; 
        } 
        public void setFabric(String fabric) { 
            this.fabric = fabric; 
        } 
        public String getSize() { 
            return size; 
        } 
        public String getFabric() { 
            return fabric; 
        } 
    
}
