package Observer;

public class Hexadecimal extends Observer {
    @Override
    public void update() {
        System.out.println("Hexadecimal equivalent :: "+Integer.toHexString(this.s.getState()));
    }

    Hexadecimal(Subject s){
        this.s=s;
        this.s.add(this);
    }
}
