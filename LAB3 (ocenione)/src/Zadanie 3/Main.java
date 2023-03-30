public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.channelNext();
        remote.channelPrevious();// not on yet

        remote.turnTvOn();
        remote.channelNext();
        remote.channelNext();
        remote.channelNext();
        remote.channelNext();
        remote.channelNext();
        remote.channelPrevious();
        remote.channelNext();
        remote.volumeIncrease();
        remote.volumeIncrease();
        remote.volumeIncrease();
        remote.volumeDecrease();
        remote.turnTvOff();

        remote.volumeDecrease();
        remote.volumeDecrease();
        remote.channelNext();
    }
}
