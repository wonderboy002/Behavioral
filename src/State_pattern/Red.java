package State_pattern;

public class Red implements trafficLights {
    @Override
    public void showMessage() {
        System.out.println("Stop!!!!!!!!!!!!!!!!!");
    }
}
