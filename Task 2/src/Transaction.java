public abstract class Transaction implements ITransaction {

    private static int idGenerator=1;
    protected int id;
    protected String type;
    protected int senderAccount;
    protected int receiverAccount;
    protected double amount;
    protected boolean isTransfered;
    public Transaction(String type,int senderAccount,int receiverAccount,double amount,boolean isTransfered)
    {
        this.type=type;
        this.senderAccount=senderAccount;
        this.receiverAccount=receiverAccount;
        this.amount=amount;
        this.isTransfered=isTransfered;
        this.id=idGenerator;
        idGenerator++;
    }
    public Transaction(double amount,String type,int senderAccount)
    {
        this.type=type;
        this.senderAccount=senderAccount;
        this.amount=amount;
        this.id=idGenerator;
        idGenerator++;
    }
    public boolean isTransfered() {
        return isTransfered;
    }
    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public int getSenderAccount() {
        return senderAccount;
    }
    public int getReceiverAccount() {
        return receiverAccount;
    }
    public double getAmount() {
        return amount;
    }

}
