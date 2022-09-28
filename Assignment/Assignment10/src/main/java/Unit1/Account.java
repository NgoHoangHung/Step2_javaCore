package Unit1;

public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private String accountBalance;


    @Override
    public void recharge(double amount) {
        System.out.println("Account.recharge");
    }

    @Override
    public void chargeEmail(String email) {
        System.out.println("Account.chargeEmail");
    }

    @Override
    public void displayInfo() {
        System.out.println("Account.displayInfo");

    }

    public static void main(String[] args) {
        Account account = new Account();
         account.recharge(3.3);
         account.chargeEmail("3.3");
         account.displayInfo();

    }
}
