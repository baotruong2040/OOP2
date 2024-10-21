package Ex5;

public class main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(114, "truong");
        Account account1 = new Account(331, customer1);

        account1.setBalance(1000.0);
        account1.deposit(1500.334);
        System.out.println(account1.getBalance());
        account1.widthdraw(3000.0);
        System.out.println(account1.getCustomerName());
        System.out.println(account1);
    }
}
