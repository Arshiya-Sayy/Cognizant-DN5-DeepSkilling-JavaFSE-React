import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products =
            new HashMap<>();

    public void addProduct(Product product) {

        products.put(
                product.getProductId(),
                product);

        System.out.println("Product Added");
    }

    public void updateProduct(
            int productId,
            int quantity,
            double price) {

        Product product =
                products.get(productId);

        if(product != null) {

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println(
                    "Product Updated");
        }
        else {
            System.out.println(
                    "Product Not Found");
        }
    }

    public void deleteProduct(
            int productId) {

        products.remove(productId);

        System.out.println(
                "Product Deleted");
    }

    public void displayInventory() {

        for(Product p : products.values()) {

            System.out.println(p);
        }
    }
}