public class Shop {
    protected String address;
    protected String size;
    Shop(String address, String size){
        this.address = address;
        this.size = size;
    }
    public String getInformation(){
        return "Shop Address: " + this.address + '\n' + "Size of shop: " + this.size;
    }

}
