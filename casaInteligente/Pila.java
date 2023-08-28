package casaInteligente;

import java.util.Stack;

public class Pila {

    static Stack<Integer> operaciones = new Stack<Integer>();
    int indice;
    boolean tipo; 

    public static void push(int indice) {
        operaciones.push(indice);
        System.out.println(operaciones);
    }

    public static void pop(Stack<Integer> operaciones, RemoteControl[] remoteControl){
        if (operaciones.isEmpty()){
            System.out.println("No hay operaciones para deshacer.");
        } else {
            int ultimaOperacion = operaciones.pop();
            remoteControl[ultimaOperacion].undo();
            System.out.println("Se deshizo la ultima operación");
        }
    }
}
