package casaInteligente;

public class LivingroomLightOffCommand {
    Light light;

    public LivingroomLightOffCommand (Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }
}
