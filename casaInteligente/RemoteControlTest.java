package casaInteligente;

import java.util.Stack;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light(null);
        //GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        //GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        Pila.push(0);
        pop(Stack<Integer>operaciones, remote Control);
        //remote.buttonWasPressed();
        //remote.setCommand(garageOpen);
        //remote.buttonWasPressed();
    }
}
