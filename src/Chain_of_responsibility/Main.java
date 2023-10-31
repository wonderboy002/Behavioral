package Chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Loan l=new Loan(180000);
        LoanApprover a=new manager(l);
        LoanApprover b=new director(l);
        LoanApprover c=new president(l);

        a.approve(b);
        b.approve(c);
        c.approve(c);
    }
}
