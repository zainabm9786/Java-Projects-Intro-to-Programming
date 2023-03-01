class Checking extends Account {
    Checking(float b) {
        super(b);
        super.setBalance(b);
    }

    public void withdrawal(float w) {
        super.withdrawal(w);
        if (super.getBalance() < 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            super.withdrawal(20.00f);
        }
    }
}
