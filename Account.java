public class Account {
    private static int account_num = 10001;
    private final int account_number;
    private float balance;

    Account() {
        this.balance = 0.00f;
        this.account_number = Account.account_num;
        Account.account_num++;
    }

    Account(float b) {
        this.balance = 0.00f;
        this.account_number = Account.account_num;
        Account.account_num++;

    }

    public int getAccount_number() {
        return this.account_number;
    }

    public void setBalance(float b) {
        this.balance = b;
    }

    public float getBalance() {
        return this.balance;
    }

    public void withdrawal(float w) {
        setBalance(this.balance - w);
    }

    public void deposit(float d) {
        setBalance(this.balance + d);
    }
}
