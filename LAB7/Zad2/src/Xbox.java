public class Xbox extends GameConsole{
    @Override
    protected void playGame(Game game) {
        if(game.type=="XBOX"){
            System.out.println("Gram teraz w " + game.name + " na xbox");
        }else {
            System.out.println("Gra "+ game.name + " nie jest na xbox!");
            System.out.println("Jest na " + game.type);
        }
    }
}
