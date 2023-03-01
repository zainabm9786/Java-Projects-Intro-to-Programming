public class Faculty extends Employee {
    private double weeklySalary;
    private double weeklyStipend;
    private double weeklyPay;

    Faculty(String n, double weeklySalary, double weeklyStipend) {
        super(n);
        this.weeklySalary = weeklySalary;
        this.weeklyStipend = weeklyStipend;

    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklyStipend(double weeklyStipend) {
        this.weeklyStipend = weeklyStipend;
    }

    public double getWeeklyStipend() {
        return weeklyStipend;
    }

    public void calculateWeeklyPay() {
        weeklyPay = weeklySalary + weeklyStipend;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName()+", Salary: " + weeklySalary +", Stipend " + getWeeklyStipend() +", Weekly Pay: "+ getWeeklyPay();
    }
}
