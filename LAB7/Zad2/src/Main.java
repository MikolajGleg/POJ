public class Main {
    public static void main(String[] args) {
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        XboxGame xboxGame1 = new XboxGame("This War of Mine",20,"XBOX");
        XboxGame xboxGame2 = new XboxGame("Darkest Dungeon",25,"XBOX");
        PlaystationGame playstationGame1 = new PlaystationGame("Minecraft",15,"PS");
        PlaystationGame playstationGame2 = new PlaystationGame("Bomberman",50,"PS");

        xbox.playGame(xboxGame1);
        xbox.playGame(xboxGame2);
        xbox.playGame(playstationGame1);
        xbox.playGame(playstationGame2);

        playstation.playGame(xboxGame1);
        playstation.playGame(xboxGame2);
        playstation.playGame(playstationGame1);
        playstation.playGame(playstationGame2);

    }
}