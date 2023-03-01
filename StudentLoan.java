public class StudentLoan extends Loan {
    private boolean isDeferred;

    StudentLoan(String customerName, double amount, double rate, int months, boolean isDef) {
        super(customerName, amount, rate, months);
        isDeferred = isDef;
    }

    @Override
    public void calculateMonthlyPayment() { //make sure this formula is correct!!!!!!!!!!!
        if (isDeferred) {
            setMonthlyPayment(0);
        } else {
            setMonthlyPayment((getInterestRate() * getLoanBalance()) / (1 - Math.pow((1 + getInterestRate()), -getNumberOfMonthlyPayments())));
        }
    }
    @Override
    public String toString() {
        return  super.toString() +", Deferment: " +isDeferred;

    }
}
