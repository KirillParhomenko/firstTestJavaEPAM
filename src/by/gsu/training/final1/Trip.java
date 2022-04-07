package by.gsu.training.final1;

public class Trip {
    final int moneyInDay;
    private String fioAccount;
    private int tripExpenses;
    private int days;

    public Trip() {
        this.moneyInDay = 100000;
    }

    public Trip(String fioAccount, int moneyInDay, int tripExpenses, int days) {
        this.moneyInDay = moneyInDay;
        this.fioAccount = fioAccount;
        this.tripExpenses = tripExpenses;
        this.days = days;
    }

    public double getTotal(){
        return ((double)tripExpenses+moneyInDay*days)/100;
    }

    public void show(){
        System.out.printf("Аккаунт = %s\nСтавка = %.2f\nТранспорт = %.2f\nДней = %d\nВсего = %.2f",
                fioAccount, (double)moneyInDay/100, (double)tripExpenses/100, days, getTotal());
    }

    public String toByn(){
        return String.format("%.2f", getTotal());
    }

    public int getMoneyInDay() {
        return moneyInDay;
    }

    public String getFioAccount() {
        return fioAccount;
    }

    public int getTripExpenses() {
        return tripExpenses;
    }

    public int getDays() {
        return days;
    }

    public void setFioAccount(String fioAccount) {
        this.fioAccount = fioAccount;
    }

    public void setTripExpenses(int tripExpenses) {
        this.tripExpenses = tripExpenses;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return fioAccount + ";" + String.format("%.2f",(double)tripExpenses/100) + ";" +
                days + ";" + toByn();
    }
}
