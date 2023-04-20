public class Playstation extends GameConsole{

    @Override
    protected void playGame(Game game) {
        if(game.type=="PS"){
            System.out.println("Gram teraz w " + game.name + " na playstation");
        }else {
            System.out.println("Gra "+ game.name + " nie jest na playstation!");
            System.out.println("Jest na " + game.type);
        }
    }
}
