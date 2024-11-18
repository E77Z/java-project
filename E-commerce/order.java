package e_commerce;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class order {
 int customerID;
 int orderID;
 double totalPrice;
 int nProducts;
 prod[]products;

    public order(int customerID, int orderID, double totalPrice, prod[]products) {
        this.customerID = Math.abs(customerID);
        this.orderID = Math.abs(orderID);
        this.totalPrice = Math.abs(totalPrice);
        this.products = products;
    }
 
 

public void printOrderInfo(){
    JOptionPane.showMessageDialog(null,"order id: "+orderID+"\ncustomer id: "+customerID);
for (int y=0;y<products.length;y++){
 if(products[y]!=null){
     JOptionPane.showMessageDialog(null,"product"+(y+1)+"\n"+products[y].getName()+"$"+products[y].getPrice());
 }   

}
    JOptionPane.showMessageDialog(null,"total price: $"+totalPrice);
}
}
