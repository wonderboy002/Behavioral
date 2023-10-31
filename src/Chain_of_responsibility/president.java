package Chain_of_responsibility;

public class president extends LoanApprover{


    Loan l;

    public president(Loan l) {

        this.l = l;
    }

    @Override
    void approve(LoanApprover next) {
        System.out.println("loan approved by president");
    }


}
