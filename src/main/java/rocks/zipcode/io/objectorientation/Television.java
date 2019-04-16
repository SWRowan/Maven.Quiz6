package rocks.zipcode.io.objectorientation;


public class Television {
    Boolean isOn = false;
    TVChannel tvChannel;

    public void turnOn() {
        isOn = true;
    }

    public void setChannel(Integer channel) {
        if(isOn){
            tvChannel = TVChannel.getByOrdinal(channel);
        }else{
            throw new IllegalStateException();
        }
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
