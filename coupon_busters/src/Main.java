public class Main {

    public static void main(String[] args){

        ProductManager.createProduct(
                "Tomato",
                "1KG",
                100F,
                10F,
                "Vegetables",
                "Murugesan",
                "Paravai Market");

        ProductManager.createProduct(
                "Table",
                "1 pc",
                500F,
                12F,
                "Furniture",
                "Anand",
                "SNS Furniture");

        ProductManager.ViewProductList();
    }

}
