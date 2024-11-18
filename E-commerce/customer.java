package e_commerce;
import java.util.Scanner;
public class customer {
    int customerId; 
        String name; 
        String addres;
        Scanner cc=new Scanner(System.in);

    public customer(int customerId, String name, String addres) {
        this.customerId = customerId;
        this.name = name;
        this.addres = addres;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId =Math.abs(customerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }



   
}
