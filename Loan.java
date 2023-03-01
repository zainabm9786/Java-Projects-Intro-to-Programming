public class Loan {
    private String customerName;
    private int accountNumber;
    private double loanBalance;
    private double monthlyPayment;
    private double interestRate;
    private int numberOfMonthlyPayments;
    private static int numberOfLoans=0;

    Loan(String customerName, double amount, double rate, int months){
        this.customerName=customerName;
        this.loanBalance =amount;
        this.interestRate=rate/100;
        this.numberOfMonthlyPayments=months;
        accountNumber=++numberOfLoans;
    }
    public static int getNumberOfLoans(){
        return numberOfLoans;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate/100;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setNumberOfMonthlyPayments(int numberOfMonthlyPayments) {
        this.numberOfMonthlyPayments = numberOfMonthlyPayments;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getNumberOfMonthlyPayments() {
        return numberOfMonthlyPayments;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static void decreaseNumberOfLoans() {
        Loan.numberOfLoans = numberOfLoans--;
    }
    public void calculateMonthlyPayment(){
        monthlyPayment=((interestRate)*loanBalance)/(1-Math.pow((1+interestRate),-numberOfMonthlyPayments));
    }

    @Override
    public String toString() {
        return "Customer Name: " + customerName +
                ", Balance: " + loanBalance + ", Rate: " + interestRate +
                ", Number of Months: " + numberOfMonthlyPayments +
                ", Monthly Payment: " + monthlyPayment;
    }
}
