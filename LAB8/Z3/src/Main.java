import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        try {
            wrong();
        } catch (IOException e) {
            System.out.println("Message: "+e.getMessage());
            System.out.println("Błąd typu: "+e.fillInStackTrace());
        }
    }

    static void wrong() throws IOException{
        throw new IOException("Input output bad!");
    }
}