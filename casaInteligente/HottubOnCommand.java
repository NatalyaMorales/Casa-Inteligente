package casaInteligente;

public class HottubOnCommand implements Command{
    Hottub hottube;
    
    public HottubOnCommand(Hottub hottube){
        this.hottube = hottube;
    }

    public void execute(){
        hottube.on();
        hottube.heat();
        hottube.bubblesOn();
    }

    public void undo(){
        hottube.off();
    }
}
