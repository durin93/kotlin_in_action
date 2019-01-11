
public class Button implements View{

    public int a;

    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }
    public static class ButtonState implements State{
    }
}
