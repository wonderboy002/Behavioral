package Mediator;

public class User extends Colleague{
    Mediator m;

    public User(Mediator m) {
        this.m = m;
        this.m.addUsers(this);
    }

    @Override
    void send(String msg) {
        this.m.notifyUsers(msg,this);
    }

    @Override
    void receive(String msg) {

        System.out.println("I received "+msg);
    }
}
