package e_commerce;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E_commerce {
    public static void main(String[] args) {
     Scanner cc=new Scanner(System.in); 
 
     

          prod e1 = new e_prod("Samsung", 1,1, "smartphone",  599.9); 
          prod c2 = new clothing_prod("Medium", "Cotton",2, "T-shirt",  19.99 ); 
          prod b1 = new book_prod( "O'Reily", "X Publications",3, "OOP", 39.99); 
   
         String Name=JOptionPane.showInputDialog("enter your name");
         
         String address=JOptionPane.showInputDialog("enter your address");
         
         int c_id=Integer.parseInt(JOptionPane.showInputDialog("enter your id"));
        
         customer cus=new customer(c_id,Name,address);
           
     int nProducts=Integer.parseInt(JOptionPane.showInputDialog("enter the number of products"));
         cart c1=new cart(c_id,nProducts);
     for(int j =0;j<nProducts;j++){
         
          int id=Integer.parseInt(JOptionPane.showInputDialog("enter the id of the product you want to add:\n1)smartphone\n2)T_shirt\n3)OOP book"));
     switch(id){
         case 1:
             c1.addProd(e1);
          JOptionPane.showMessageDialog(null,"product has been added");

             break;
         case 2:
             c1.addProd(c2);
          JOptionPane.showMessageDialog(null,"product has been added");
             break;
         case 3:
             c1.addProd(b1);
          JOptionPane.showMessageDialog(null,"product has been added");
             break;
         default:
          JOptionPane.showMessageDialog(null,"product not found");
              break;}}
     
    
         int ans=Integer.parseInt(   JOptionPane.showInputDialog("the total price is: "+c1.calculatePrice()+"\n 1)place order?\n2)remove product\n0)cancel order"));
         if (ans==1){
         c1.placeorder();
         return;
         }
         else if(ans==0)
         {
             JOptionPane.showMessageDialog(null,"order refused");    
         }
         else if(ans==2){
             c1.sum=0;
             int num=Integer.parseInt(JOptionPane.showInputDialog("enter the number of products you want to remove:"));

             for(int k=0;k<num;k++){
         
          int ANS=Integer.parseInt(JOptionPane.showInputDialog("enter the id of the product you want to remove:\n1)smartphone\n2)T_shirt\n3)OOP book"));
          
          if(ANS==1){
             c1.removeProd(e1);
               JOptionPane.showMessageDialog(null,"product has been removed");                       }
          
          else if(ANS==2){
              c1.removeProd(c2);
               JOptionPane.showMessageDialog(null,"product has been removed");
             }
          
          else if(ANS==3){
             c1.removeProd(b1);
               JOptionPane.showMessageDialog(null,"product has been removed");             }
          
          else{
                 JOptionPane.showMessageDialog(null,"product not found");
             }
         }
         
             int Ans=Integer.parseInt( JOptionPane.showInputDialog("the total price is: "+c1.calculatePrice()+"\n 1)place order?\n0)cancel order"));
          
             if (Ans==1){
         c1.placeorder();
         }
         
             else if(Ans==0)
         {
             JOptionPane.showMessageDialog(null,"order refused");    
         }
         }}

     }  
