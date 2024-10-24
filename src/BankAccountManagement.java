// 5.7
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int query = 1;

        BankAccount newAcc = new BankAccount("Lenh Ho Xung", 5000000, 5);

        while (query > 0) {
            System.out.println("""
                --- Bank Account Management ---
                0. Exit
                1. Check current balance
                2. Deposit money
                3. Withdraw money
                4. Show transaction history
                > Choose an option:
            """);
            query = keyboard.nextInt();
            processQuery(keyboard, newAcc, query);
        }

        System.exit(0);
    }

    private static void processQuery(Scanner keyboard, BankAccount acc, int query) {
        int amount;
        switch (query) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                acc.CheckCurrentAccount();
                break;
            case 2:
                System.out.println("Deposit amount: ");
                amount = keyboard.nextInt();
                acc.Deposit(amount);
                break;
            case 3:
                System.out.println("Withdraw amount: ");
                amount = keyboard.nextInt();
                acc.Withdraw(amount);
                break;
            case 4:
                System.out.println("Transaction history: ");
                acc.showTransactionHistory();
                break;
            default:
                System.out.println("This option is not supported.");
                break;
        }
    }

}

class BankAccount {
    private final String holderName;
    private int balance;
    private double interestRate;
    private int withdrawLimit = 3;
    private List<String> transactionHistory;

    public BankAccount(String holderName, int balance, double interestRate) {
        this.holderName = holderName;
        this.balance = balance;
        this.interestRate = interestRate;
        this.transactionHistory = new ArrayList<>();
    }

    public void CheckCurrentAccount() {
        System.out.println("Holder's name: " + holderName);
        System.out.println("Current balance: " + balance + " VND");
    }

    public void Deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposit - " + amount + " VND");
        System.out.println("[Succeed]");
        CheckCurrentAccount();
    }

    public void Withdraw(int amount) {
        if (withdrawLimit <= 0) {
            System.out.println("[Error] You have reached your withdrawal limit this month");
            return;
        }
        if (amount > balance) {
            System.out.println("[Error] Oops, you don't have that much");
            return;
        }
        balance -= amount;
        withdrawLimit--;
        transactionHistory.add("Withdraw - " + amount + " VND");
        System.out.println("[Succeed]");
        CheckCurrentAccount();
    }

    public void showTransactionHistory() {
        for (String i : transactionHistory) {
            System.out.println(i);
        }
        updateInterest();
    }

    public void updateInterest() {
        double interest = interestRate/100 + 1;
        double balanceAfterInterest = balance * interest;
        System.out.println("Balance after adding interest: " + balanceAfterInterest + " VND");
    }

}

