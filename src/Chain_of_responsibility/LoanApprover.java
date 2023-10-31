package Chain_of_responsibility;

public abstract class LoanApprover {
    abstract void approve(LoanApprover next);
    LoanApprover nextApprover;
     void setNextApprover(LoanApprover next){
        this.nextApprover=next;
     }
}
