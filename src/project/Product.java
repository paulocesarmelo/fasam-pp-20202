package project;

public class Product {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private double value;

    public String getName() {
            return this.name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
	
        
        
}
