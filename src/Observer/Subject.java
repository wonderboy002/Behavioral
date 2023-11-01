package Observer;


import java.util.ArrayList;

public class Subject {
    private int state;
    private ArrayList<Observer> arr=new ArrayList<>();

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }

    public int getState() {
        return state;
    }

    public void add(Observer s){
        this.arr.add(s);
    }

    public void notifyObservers(){

           for (Observer s : this.arr){
               s.update();
           }

    }
}
