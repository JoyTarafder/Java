
package mainpkg;

public class Product {
    int id;
    String name, description;
    float price;
    //...

    public Product() {
        //Matrix m1 = new Matrix();
        //m1.vals = null;
    }

    public Product(int id, String name, String description, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + '}';
    }
    
    
    public void showProductToConsole(){
        System.out.println("id=" + id + ", name=" + name + ", description=" + description + ", price=" + price);
    }
    
    
}
