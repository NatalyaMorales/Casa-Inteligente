package casaInteligente;

public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;

    GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.down();
    }
}
