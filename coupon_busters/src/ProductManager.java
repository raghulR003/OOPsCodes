public class ProductManager {

    static Product[] productsList = new Product[100];

    public static Product createProduct(String name, String quantity, Float price, Float discount, String category, String sellername, String sellerAddress ){

        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        product.setDiscount(discount);
        product.setCategory(category);
        product.setSellerName(sellername);
        product.setSellerAddress(sellerAddress);

        for (int i = 0; i< productsList.length; i++){
            if(productsList[i] == null){
                productsList[i] = product;
                break;
            }
        }

        return  product;
    }

    public static void ViewProduct(Product product){

        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println(product.getPrice());
        System.out.println(product.getDiscount());
        System.out.println(product.getCategory());
        System.out.println(product.getSellerName());
        System.out.println(product.getSellerAddress());

    }

    public static void ViewProductList(){

        for (int i = 0; i< productsList.length; i++){
            if(productsList[i] == null){
                break;
            }
            ViewProduct(productsList[i]);
            System.out.println("\n");
        }
    }



}

