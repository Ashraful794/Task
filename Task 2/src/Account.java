import java.util.ArrayList;
import java.util.List;

public class Account implements IAccount {
    private static int accountNumberGenerator=0;
    private int accountNumber;
    private String name;
    private double balance;
    private List<Transaction> transactions=new ArrayList<>();
    public Account(double balance)
    {
        this.balance=balance;
        this.accountNumber=accountNumberGenerator+1;
        accountNumberGenerator++;
        Transaction transaction=new Credit(this.balance,this.accountNumber);
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposite(double amount) {
        if(amount>0)
        {
            this.balance+=amount;
            Transaction transaction=new Credit(this.balance,this.accountNumber);
            this.transactions.add(transaction);
        }
        else
        {
            System.out.println("Amount is Invalid");
        }

    }

    @Override
    public void withdrow(double amount) {

        if(amount<0)
        {
            System.out.println("Amount is invalid");
        }
        else
        {
            if(balance-amount>0)
            {
                this.balance-=amount;
                Transaction transaction=new Debit(this.balance,this.accountNumber);
                this.transactions.add(transaction);
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }

    }

    @Override
    public void transfer(int accountNumber, double amount) {
        Account receiver=Bank.getAccountByAccountNumber(accountNumber);

        if(receiver!=null && receiver.accountNumber!=this.accountNumber)
        {
            if(amount<0)
            {
                System.out.println("Amount is invalid");
            }
            else
            {
                if(balance-amount>0)
                {
                    this.balance-=amount;
                    receiver.setBalance(receiver.getBalance()+amount);
                    Transaction sendertransaction=new Debit(this.accountNumber,receiver.getAccountNumber(),amount,true);
                    this.transactions.add(sendertransaction);
                    Transaction reciverTransaction=new Credit(this.accountNumber,receiver.getAccountNumber(),amount,true);
                    receiver.transactions.add(reciverTransaction);
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
            }

        }
        else
        {
            System.out.println("Invalid Receiver Account Number");
        }

    }
    @Override
    public void accountInfo() {
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Name: "+this.name);
        System.out.println("Balance: "+this.balance);
    }
    @Override
    public void showTransactions() {
        for (Transaction transaction: transactions)
        {
            transaction.showTransaction();
        }
    }
    @Override
    public void showBalance() {
        System.out.println("Balance: "+this.balance);
    }
}
