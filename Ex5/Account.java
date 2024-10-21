package Ex5;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        }
    
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    } 
    public String toString() {
        double roundedBalance;
        roundedBalance = Math.round(balance*100)/100d;
        return customer +" balance =$"+ roundedBalance;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account widthdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {
            System.out.println("amount widthdraw exceeds the current balance!");
        }
        return this;
    }
}
