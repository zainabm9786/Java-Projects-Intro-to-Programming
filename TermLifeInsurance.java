public class TermLifeInsurance extends InsurancePolicy {
    private String beneficiary;
    private int term;
    private double termPayout;

    TermLifeInsurance(String name, String beneficiary, int att, double termPayout) {
        super(name);
        // super.setPolicyHolder(name);
        this.beneficiary = beneficiary;
        term = att;
        this.termPayout = termPayout;
    }
    @Override
    public void selectPolicyCoverage() {
        System.out.println("Selecting policy coverages");
    }

    @Override
    public void calculatePremium() {
        System.out.println("Calculating and updating premium");
    }

    public double getTermPayout() {
        return termPayout;
    }

    public int getTerm() {
        return term;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }

    @Override
    public String toString() {
        return super.getPolicyHolder()+ ", " + super.getPolicyNumber();

                /*+
                ", beneficiary: " + beneficiary +
                ", term:" + term +
                ", termPayout: " + termPayout;*/ // It says to add this in the directions, I think, but the sample out put doesnt have it, so I commented it out in case I needed it
    }
}
