package Observer;

public class Binary extends Observer {
    @Override
    public void update() {
        System.out.println("Binary equivalent of state :: "+Integer.toBinaryString(this.s.getState()));
    }

    public Binary(Subject s) {
        this.s=s;
        this.s.add(this);
    }
}
