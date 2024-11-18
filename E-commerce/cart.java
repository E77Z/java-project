package e_commerce;
import java.util.Scanner;
public class cart {
    Scanner cc=new Scanner(System.in);
     int customerId; 
        int nProducts; 
         prod [] products = new prod [nProducts]; 
        public cart(int customerId,int nProducts){
        this.customerId=Math.abs(customerId);
        this.nProducts=Math.abs(nProducts);
        this.products=new prod[this.nProducts];
        }

        public void setCustomerId(int customerId) { 
            this.customerId = customerId; 
        } 
        public void setnProducts(int nProducts) { 
            this.nProducts = Math.abs(nProducts);
            products=new prod[this.nProducts];
        } 
        public void setProducts(prod [] products) { 
            this.products = products; 
        } 
        public int getCustomerId() { 
            if (customerId>0) 
        return customerId; 
        else 
        return Math.abs(customerId); 
        } 
        public int getnProducts() { 
            if (nProducts>0) 
        return nProducts; 
        else 
        return Math.abs(nProducts); 
        } 
        public prod [] getProducts() { 
            return products; 
        } 
  
        
public void addProd(prod product){
for(int i=0;i<products.length;i++){
if (products[i]==null) {
products[i]=product;
break;
}
}
}

    public void removeProd(prod product){
    for (int i=0;i<nProducts;i++){
    if(products[i]==product){
    products[i]=null;
    break;
 }}}
        
public double sum=0;
public double calculatePrice(){
for(int i=0; i<nProducts;i++){
if (products[i]!=null) {
sum+=products[i].getPrice();
}
}
return sum;
}

public void placeorder(){ 
    order o1=new order(customerId,5555,sum, products);
    o1.printOrderInfo();}

}
