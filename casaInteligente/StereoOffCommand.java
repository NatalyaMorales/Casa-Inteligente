package casaInteligente;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }
}
