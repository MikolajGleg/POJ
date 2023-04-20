public class Main {
    public static void main(String[] args) throws RuntimeException {
        System.out.println("Hello world!");
        try {
            wrong();
        } catch (RuntimeException e) {
            System.out.println("Message: "+e.getMessage());
            System.out.println("Błąd typu: "+e.fillInStackTrace());
        }
    }

    static void wrong() throws RuntimeException{
        throw new RuntimeException("Runtime bad!");
    }
}