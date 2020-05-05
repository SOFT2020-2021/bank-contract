package contract.transferables;

import contract.Contract;

import java.io.Serializable;

public class TransactionActivityTransferable implements Contract<TransactionActivityTransferable>, Serializable {

    private long amount;
    private int senderAccountId;
    private int receiverAccountId;

    public TransactionActivityTransferable(long amount, int senderAccountId, int receiverAccountId) {
        this.amount = amount;
        this.senderAccountId = senderAccountId;
        this.receiverAccountId = receiverAccountId;
    }

    public TransactionActivityTransferable() {};

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getSenderAccountId() {
        return senderAccountId;
    }

    public void setSenderAccountId(int senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public int getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setReceiverAccountId(int receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }
}
