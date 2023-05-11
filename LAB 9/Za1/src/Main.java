public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();
        Hipopotam hipopotam = new Hipopotam();

        Animal animals[] = {kot, pies, hipopotam};

        for (Animal animal: animals) {
           animal.makeSound();
        }
    }
}