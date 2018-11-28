package command.example;

//Receiver
public class Light{
    private boolean on;
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }

    @Override
    public String toString() {
        return "" + on;
    }
}