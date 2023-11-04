package Mediator;

public interface Mediator {
    void notifyUsers(String msg,Colleague c);
    void addUsers(Colleague c);
}
