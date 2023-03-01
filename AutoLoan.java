public class AutoLoan extends Loan{
    private double downPayment;

    AutoLoan(String customerName, double amount, double rate, int months, double down) {
        super(customerName, amount, rate, months);
        downPayment=down;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getDownPayment() {
        return downPayment;
    }
    @Override
    public void calculateMonthlyPayment() {
            setMonthlyPayment((getInterestRate() * (getLoanBalance()-downPayment)) / (1 - Math.pow((1 + getInterestRate()), -getNumberOfMonthlyPayments())));

    }
    @Override
    public String toString() {
        return super.toString() + ", Down Payment: " +downPayment;
    }
}
