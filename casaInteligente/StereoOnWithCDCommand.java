package casaInteligente;

public class StereoOnWithCDCommand implements Command{
    Stereo stero;

    public StereoOnWithCDCommand (Stereo stereo){
        this.stero = stereo;
    }

    public void execute(){
        stero.on();
        stero.setCD();
        stero.setVolume(11);
    }
}