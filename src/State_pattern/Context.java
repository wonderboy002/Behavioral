package State_pattern;

public class Context {
    private trafficLights state;

    public Context() {
        this.state = new Red();
    }

    public void setState(trafficLights state) {
        this.state = state;
    }

    public trafficLights getState() {
        return state;
    }

    public void work(){
        this.state.showMessage();
    }
}
