package pl.jakubkrys.shopping_cart;

public class ShopMain {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Product("Mleko", 2.25),12);
        shop.add(new Product("Masło", 5.15),2);

        System.out.println("To pay: " + shop.calculate());
    }
}