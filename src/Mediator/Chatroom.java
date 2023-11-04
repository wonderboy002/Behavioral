package Mediator;

import java.util.ArrayList;

public class Chatroom implements Mediator{
    ArrayList<Colleague> arr=new ArrayList<>();

    @Override
    public void notifyUsers(String msg, Colleague c) {
          for (Colleague i : arr){
              if (i!=c){
                  i.receive(msg);
              }
          }
    }

    @Override
    public void addUsers(Colleague x) {
        this.arr.add(x);
    }
}
