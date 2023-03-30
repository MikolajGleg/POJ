public class Bakery extends Shop{
    protected String[] products;

    Bakery(String address, String size, String[] products){
        super(address,size);
        this.products = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            this.products[i] = products[i];
        }
    }

    @Override
    public String getInformation() {
        String prodString = "";
        for (int i = 0; i < this.products.length; i++) {
            prodString += products[i] + '\n';
        }
        return "Shop Address: " + this.address + '\n' + "Size of shop: " + this.size + '\n' + "Products in bakery: " + prodString;
    }
}
