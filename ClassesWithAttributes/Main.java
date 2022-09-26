public class Main {
    public static void main(String[] args) {
    	   Product product = new Product(1,"laptop","Asus laptop",3500,6,"Siyah");
           product.setName("Laptop");
           product.setId(1);
           product.setName("Asus Laptop");
           product.setPrice(5000);
           product.setStockAmount(3);
           product.setRenk("siyah");

           ProductManager productManager = new ProductManager();
           productManager.Add(product);
    }  
}