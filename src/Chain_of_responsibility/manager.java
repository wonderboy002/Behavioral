package Chain_of_responsibility;

public class manager extends LoanApprover{

    Loan l;

    public manager(Loan l) {

        this.l = l;
    }

    @Override
    void approve(LoanApprover next) {
        if (l.getAmount()<=100000){
            System.out.println("Loan approved by manager");
        }
        else {
            System.out.println("Responsibility delegated to director");
            this.setNextApprover(next);
        }
    }

}
