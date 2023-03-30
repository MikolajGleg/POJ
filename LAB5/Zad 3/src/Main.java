public class Main {
    public static void main(String[] args) {
        Podklasa1 car1 = new Podklasa1("red","Volvo");
        Podklasa2 car2 = new Podklasa2("blue","Mitsubishi");
        Podklasa3 car3 = new Podklasa3("pink", "Rolls Royce");

        Car[] carsArray = {car1,car2,car3};

        for (Car car: carsArray) {
            System.out.println(car.color);
            System.out.println(car.marka + '\n');
        }
    }
}