import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) 
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) 
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account Holder: " + accountHolderName + "\n"+
                "Balance: " + balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String accountHolderName, double balance, double withdrawalLimit) {
        super(accountHolderName, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) 
        super.withdraw(amount);
    }

    public void setWithdrawalLimit(double limit) {
        this.withdrawalLimit = limit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount("Pratyush Mahajan", 7000, 1500);
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Change Withdrawal Limit");
            System.out.println("4. Display Current Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs.");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited: Rs." + depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: Rs.");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > account.getWithdrawalLimit()) {
                        System.out.println("Withdrawal exceeds limit of Rs." + account.getWithdrawalLimit());
                    } else {
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawn: Rs." + withdrawAmount);
                    }
                    break;
                case 3:
                    System.out.print("Enter new withdrawal limit: Rs.");
                    double newLimit = sc.nextDouble();
                    account.setWithdrawalLimit(newLimit);
                    System.out.println("New withdrawal limit set to: Rs." + newLimit);
                    break;
                case 4:
                    System.out.println(account.getAccountDetails());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 5);

        sc.close();
    }
}
