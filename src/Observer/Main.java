package Observer;

public class Main {
    public static void main(String[] args) {
          Subject s=new Subject();

          Observer b=new Binary(s);
          Observer o=new Octal(s);
          Observer h=new Hexadecimal(s);
          s.setState(12);
          s.setState(212);
    }
}
