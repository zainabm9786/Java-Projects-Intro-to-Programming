public class HealthInsurancePolicy extends InsurancePolicy implements Deductible {
    private double deductibleLimit;
    private double totalDeductiblePaid = 0;
    private double coPayment;
    private double totalCoPaymentPaid = 0;
    private double totalOutOfPocket;

    HealthInsurancePolicy(String name, double coPayment, double deductibleLimit, double totalOutOfPocket) {
        super(name);
        this.coPayment = coPayment;
        this.deductibleLimit = deductibleLimit;
        this.totalOutOfPocket = totalOutOfPocket;
    }

    @Override
    public boolean hasMetDeductible() {
        if (totalDeductiblePaid >= deductibleLimit) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasMetTotalOutOfPocket() {
        if (totalDeductiblePaid + totalCoPaymentPaid >= totalOutOfPocket) {
            return true;
        }
        return false;
    }

    @Override
    public void selectPolicyCoverage() {
        System.out.println("Selecting policy coverages");
    }

    @Override
    public void calculatePremium() {
        System.out.println("Calculating and updating premium");
    }

    public double getCoPayment() {
        return coPayment;
    }

    public double getDeductibleLimit() {
        return deductibleLimit;
    }

    public double getTotalCoPaymentPaid() {
        return totalCoPaymentPaid;
    }

    public double getTotalDeductiblePaid() {
        return totalDeductiblePaid;
    }

    public double getTotalOutOfPocket() {
        return totalOutOfPocket;
    }

    public void setCoPayment(double coPayment) {
        this.coPayment = coPayment;
    }

    public void setDeductibleLimit(double deductibleLimit) {
        this.deductibleLimit = deductibleLimit;
    }

    public void setTotalCoPaymentPaid(double totalCoPaymentPaid) {
        this.totalCoPaymentPaid = totalCoPaymentPaid;
    }

    public void setTotalDeductiblePaid(double totalDeductiblePaid) {
        this.totalDeductiblePaid = totalDeductiblePaid;
    }

    public void setTotalOutOfPocket(double totalOutOfPocket) {
        this.totalOutOfPocket = totalOutOfPocket;
    }

    @Override
    public String toString() {
        return super.getPolicyHolder() + ", "+super.getPolicyNumber() +
                ", Met Deductible: "+ hasMetDeductible()+ ", Met Total Out-of-Pocket:" +hasMetTotalOutOfPocket();


        /*" DeductibleLimit: " + deductibleLimit +
                ", totalDeductiblePaid: " + totalDeductiblePaid +
                ", coPayment: " + coPayment +
                ", totalCoPaymentPaid: " + totalCoPaymentPaid +
                ", totalOutOfPocket: " + totalOutOfPocket;*/
    }
}
