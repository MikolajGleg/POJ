public class Remote {
    TV tv;

    public Remote(TV tv){
        this.tv = tv;
    }
    void channelNext(){
        if(this.tv.on){
            if( this.tv.channel+1 <= 20 ){
                this.tv.channel++;
            }
            System.out.println("Channel is " + this.tv.channel);
        }else {
            System.out.println("Turn on the TV to change channels!");
        }

    }

    void channelPrevious(){
        if(this.tv.on) {
            if (this.tv.channel-1 >= 0) {
                this.tv.channel--;
            }
            System.out.println("Channel is " + this.tv.channel);
        }else{
            System.out.println("Turn on the TV to change channels!");
        }
    }

    void volumeIncrease(){
        if(this.tv.on) {
            if( this.tv.volume+1 <= 10 ){
                this.tv.volume++;
            }
            System.out.println("Volume is " + this.tv.volume);
        }else{
            System.out.println("Turn on the TV to change volume!");
        }
    }

    void volumeDecrease(){
        if(this.tv.on){
            if( this.tv.volume-1 >= 0 ){
                this.tv.volume--;
            }
            System.out.println("Volume is " + this.tv.volume);
        }else{
            System.out.println("Turn on the TV to change volume!");
        }
    }

    void turnTvOn(){
        this.tv.on = true;
        this.tv.channel = 18;
        this.tv.volume = 5;
        System.out.println("TV is on!");
    }

    void turnTvOff(){
        this.tv.on = false;
        System.out.println("TV is off!");
    }
}
