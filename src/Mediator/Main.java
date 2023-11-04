package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator m=new Chatroom();
        Colleague c1=new User(m);
        Colleague c2=new User(m);
        Colleague c3=new User(m);
        Colleague c4=new User(m);

        m.addUsers(c1);
        m.addUsers(c2);
        m.addUsers(c3);
        m.addUsers(c4);

        c1.send("Hello world");
    }
}
