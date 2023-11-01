package Observer;

public class Octal extends Observer{
    @Override
    public void update() {
        System.out.println("Octal equivalent of subject :: "+Integer.toOctalString(this.s.getState()));
    }

    Octal(Subject s){
        this.s=s;
        this.s.add(this);
    }
}
