
public class Product {
	public Product(int id, String name, String descrpription, double price, int stockAmount, String renk) {
        this.id = id;
        this.name = name;
        this.descrpription = descrpription;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product() {

    }

    //attribute / field
    private int id;
    private String name;
    private String descrpription;
    private double price;
    private int stockAmount;
    private String renk;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrpription() {
        return descrpription;
    }

    public void setDescrpription(String descrpription) {
        this.descrpription = descrpription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
