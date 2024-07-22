import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachineInterface {
    private final List<HotBottle> products;

    public HotDrinkMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(HotBottle product) {
        products.add(product);
    }

    @Override
    public HotBottle getProduct(String name, double volume, int temperature) {
        for (HotBottle product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }

    public String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список горячих напитков:\n");
        for (HotBottle product : products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}