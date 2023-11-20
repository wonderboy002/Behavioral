package State_pattern;
public class Main {
    public static void main(String[] args) {
        Context c=new Context();
        c.work();

        c.setState(new Yellow());
        c.work();

        c.setState(new Green());
        c.work();
    }
}
