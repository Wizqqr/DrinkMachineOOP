public class Main {
    public static void main(String[] args) {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();

        HotBottle coffee = new HotBottle("Coffee", 100, 0.25, 80);
        HotBottle tea = new HotBottle("Tea", 50, 0.3, 70);
        HotBottle hotChocolate = new HotBottle("Hot Chocolate", 120, 0.2, 85);

        hotDrinkMachine.addProduct(coffee);
        hotDrinkMachine.addProduct(tea);
        hotDrinkMachine.addProduct(hotChocolate);

        System.out.println(hotDrinkMachine.getProductsInfo());
    }
}