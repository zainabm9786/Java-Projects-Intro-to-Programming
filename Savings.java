public class Savings extends Account {
    private int count = 0;

    Savings(float b) {
        super(b);
        super.setBalance(b);
    }

    @Override
    public void withdrawal(float w) {
        if ((super.getBalance() - w) >= 500) {
            super.withdrawal(w);
            // return getBalance();
        } else {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(w+10.00f);
            //return getBalance();
        }
    }

    @Override
    public void deposit(float d) {
        count++;
        System.out.println("This is deposit " + count + " to this account");
        if (count > 5) {
            System.out.println("Charging a fee of $10 ");
            super.deposit(d - 10);
        }
        else {
            super.deposit(d);
        }
    }

    public void interest() {
        float x = (float) (.015 * super.getBalance());
        System.out.println("Customer earned " + x + " in interest");
        super.deposit(x);
    }

    /*public float getInterest() {
        float x = (float) (super.getBalance() + (.015 * super.getBalance()));
        super.deposit(x);
    }*/
}
