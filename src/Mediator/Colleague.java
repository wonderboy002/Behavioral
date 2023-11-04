package Mediator;

public abstract class Colleague {
    abstract void send(String msg);
    abstract void receive(String msg);
}
