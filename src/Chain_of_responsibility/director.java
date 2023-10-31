package Chain_of_responsibility;

public class director extends LoanApprover{
    private LoanApprover next;

    Loan l;

    public director(Loan l) {

        this.l = l;
    }

    @Override
    void approve(LoanApprover next) {
        if (l.getAmount()<=150000){
            System.out.println("loan approved by director");
        }
        else {
            System.out.println("responsibility delegated to president");
            this.setNextApprover(next);
        }
    }


}
