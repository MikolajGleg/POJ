public class Konto {
    double balance;
    int id;

    public Konto(){

    }
    public Konto(double balance, int id){
        this.balance = balance;
        this.id = id;
    }
    void checkBalance(){
        System.out.println("Your balance is " + this.balance);
    }

    void addBalance(int money){
        System.out.println("Your deposited " + money);
        this.balance += money;
    }
    void takeOutBalance(int money){
        System.out.println("You took out " + money);
        this.balance -= money;
    }
}
