package e_commerce;
public class book_prod extends prod{
  String author; 
        String publisher; 

    public book_prod(String author, String publisher, int productId, String Name, double price) {
        super(productId, Name, price);
        this.author = author;
        this.publisher = publisher;
    }
        
        public void setAuthor(String author) { 
            this.author = author; 
        } 
        public void setPublisher(String publisher) { 
            this.publisher = publisher; 
        } 
        public String getAuthor() { 
            return author; 
        } 
        public String getPublisher() { 
            return publisher; 
        }     
}
