public class Credit extends Transaction{

    public Credit(int senderAccount,int recevierAccount,double amount,boolean isTransfered)
    {
        super("Credit",senderAccount,recevierAccount,amount,isTransfered);
    }
    public Credit(double amount,int senderAccount)
    {
        super(amount,"Credit",senderAccount);
    }
    @Override
    public void showTransaction() {
        System.out.println("Transaction ID: "+this.getId());
        System.out.println("Transaction Type: "+this.getType());
        System.out.println("Amount: "+ this.getAmount());

        if(this.isTransfered())
        {
            System.out.println("Sender Account: "+this.getSenderAccount());
        }
    }
}
