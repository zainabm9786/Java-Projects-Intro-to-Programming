public abstract class InsurancePolicy {
    private String policyHolder;
    private int policyNumber;
    private static int numberOfPolicies=0;
    private double premium=0;

    InsurancePolicy(String name){
        policyHolder=name;
        policyNumber=numberOfPolicies++;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public double getPremium() {
        return premium;
    }

    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public static void setNumberOfPolicies(int numberOfPolicies) {
        InsurancePolicy.numberOfPolicies = numberOfPolicies;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
    public abstract void selectPolicyCoverage();
    public abstract void calculatePremium();

    @Override
    public String toString() {
        return policyHolder +
                ", policyNumber: " + policyNumber +
                ", premium: " + premium;
    }
}
