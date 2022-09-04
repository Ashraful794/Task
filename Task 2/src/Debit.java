public class Debit extends Transaction {

    public Debit(int senderAccount,int receiverAccount,double amount,boolean isTransfered)
    {
        super("Debit",senderAccount,receiverAccount,amount,isTransfered);
    }
    public Debit(double amount,int senderAccount)
    {
        super(amount,"Debit",senderAccount);
    }
    @Override
    public void showTransaction() {
        System.out.println("Transaction ID: "+this.getId());
        System.out.println("Transaction Type: "+this.getType());
        System.out.println("Amount: "+ this.getAmount());

        if(this.isTransfered())
        {
            System.out.println("Receiver Account: "+this.getReceiverAccount());
        }
    }
}
