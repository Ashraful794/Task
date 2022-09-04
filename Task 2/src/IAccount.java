public interface IAccount {
    void deposite(double amount);
    void withdrow(double amount);
    void transfer(int accountNumber,double amount);
    void accountInfo();
    void showTransactions();
    void showBalance();
}
