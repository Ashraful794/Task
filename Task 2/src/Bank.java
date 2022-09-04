import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bank {
    public static Scanner scanner=new Scanner(System.in);
    public static List<Account> accountList=new ArrayList<>();
    public static  Account getAccountByAccountNumber(int accountNumber)
    {
        Account account=null;

        for (int i=0;i<accountList.size();i++)
        {
            if(accountList.get(i).getAccountNumber()==accountNumber)
            {
                account=accountList.get(i);
                return account;
            }
        }
        return null;

    }
    public static int createAccount(double ammount)
    {
        Account account=new Account(ammount);
        Bank.accountList.add(account);
        return account.getAccountNumber();
    }
    public static void createAccountPage()
    {
        double balance=0;
        System.out.println("Enter initial deposite amount: ");
        Scanner snr=new Scanner(System.in);

        if(!snr.hasNextInt())
        {
            System.out.println("Please Provide valid Amount");
            startPage();
        }

        balance=snr.nextDouble();
        int accountNumber=createAccount(balance);
        System.out.println("Your Account is successfully created with initail deposite "+balance);
        System.out.println("Your Account Number is "+accountNumber);
        System.out.println("--------");
        startPage();

    }

    public static void startPage()
    {
        char userInput;
        System.out.println("Type 1 and press enter for create Account");

        System.out.println("Type 2 and press enter for go to your Account");

        System.out.println("Press any key and enter for Exit");


        System.out.println("--------");

        userInput=scanner.next().charAt(0);
        if(userInput=='1')
        {
            createAccountPage();
        }
        else if(userInput=='2')
        {
            int accountNumber;
            System.out.println("Enter your account number");
            accountNumber=scanner.nextInt();
            Account account=getAccountByAccountNumber(accountNumber);

            if (account!=null)
            {
                account.accountInfo();
                System.out.println("Type 1 for and enter for deposit");
                System.out.println("Type 2 for and enter for withdraw");
                System.out.println("Type 3 for and enter for transfer");
                System.out.println("Type 4 for show transactions history");
                System.out.println("Type 5 for show Balance");
                System.out.println("Type 6 for show Account Information");
                System.out.println("Type 7 for User Name");
                System.out.println("Press any key and enter for Exit");
                char userinput=scanner.next().charAt(0);

                if(userinput=='1')
                {
                    System.out.println("Enter amount: ");
                    double amount=scanner.nextDouble();
                    account.deposite(amount);
                    startPage();
                }
                else if(userinput=='2')
                {
                    System.out.println("Enter amount: ");
                    double amount=scanner.nextDouble();
                    account.withdrow(amount);
                    startPage();
                }
                else if (userinput=='3')
                {
                    System.out.println("Enter Receiver Id: ");
                    int receiverid=scanner.nextInt();
                    System.out.println("Enter amount: ");
                    double amount=scanner.nextDouble();
                    account.transfer(receiverid,amount);
                    startPage();
                }
                else if(userinput=='4')
                {
                    account.showTransactions();
                    startPage();
                }
                else if(userinput=='5')
                {
                    account.showBalance();
                    startPage();
                }
                else if(userinput=='6')
                {
                    account.accountInfo();
                    startPage();
                }
                else if(userinput=='7')
                {
                    System.out.println("Enter Name: ");
                    String name=scanner.next();
                    account.setName(name);
                    startPage();
                }
                else
                {
                    System.exit(0);
                }

            }
            else
            {
                System.out.println("Invalid Account Number");
                startPage();
            }

        }
        else
            System.exit(0);

    }

    public static void main(String[] args) {

        Bank.startPage();

    }
}















