public class Main {
    public static void main(String[] args) {
        String[] bookshopProducts = {"Do Androids Dream of Electric Sheep?", "The Hitchhiker's Guide to the Galaxy (The Hitchhiker's Guide to the Galaxy, #1)", "To Kill a Mockingbird","A Clockwork Orange","I Have No Mouth and I Must Scream"};
        String[] bakeryProducts = {"Baguettes","Bread","Bread Roll","Muffins","Pizza"};
        Bookshop bookshop = new Bookshop("123 Fake street", "200m^2", bookshopProducts);
        Bakery bakery = new Bakery("10 Downing Street", "100m^2", bakeryProducts);

        System.out.println(bakery.getInformation());
        System.out.println(bookshop.getInformation());
    }
}