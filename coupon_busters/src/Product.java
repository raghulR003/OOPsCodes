public class Product {
    private String name;
    private Float discount;
    private  String category;
    private Float price;
    private String sellername;
    private String sellerAddress;
    private String quantity;

    public void setName(String name){
        this.name = name;
    }
    public void setDiscount(Float discount){
        this.discount = discount;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(Float price){
        this.price = price;
    }
    public void setSellerName(String sellerName){
        this.sellername = sellerName;
    }
    public void setSellerAddress(String sellerAddress){
        this.sellerAddress = sellerAddress;
    }
    public void setQuantity(String quantity) { this.quantity = quantity;}

    String getName(){
        return this.name;
    }
    Float getPrice(){
        return this.price;
    }
    Float getDiscount(){
        return this.discount;
    }
    String getCategory(){
        return this.category;
    }
    String getSellerName(){
        return this.sellername;
    }
    String getSellerAddress(){
        return this.sellerAddress;
    }
    String getQuantity() { return this.quantity; }

}
