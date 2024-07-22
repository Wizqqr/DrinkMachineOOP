import java.util.ArrayList;
import java.util.List;

public class Machine {
    private int id;
    private int productId;
    private final List<Product> products;

    public Machine(int id) {
        this.id = id;
        products = new ArrayList<>();
    }

    public int size(){
        return products.size();
    }

    public void addProduct(Product product){
        product.setId(productId++);
        products.add(product);
    }

//    public Product getByName(String name){
//        for (Product product : products) {
//            if (product.getName().equals(name)){
//                return product;
//            }
//        }
//        return null;
//    }
    public String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список товаров:\n");
        for (Product product : products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
