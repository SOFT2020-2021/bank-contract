package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class TransactionActivityTransferable implements Contract<TransactionActivityTransferable>, Serializable {
    private long amount;
    private long senderAccountId;
    private long receiverAccountId;

    public TransactionActivityTransferable() {
    }

    public TransactionActivityTransferable(long amount, int senderAccountId, int receiverAccountId) {
        this.amount = amount;
        this.senderAccountId = (long)senderAccountId;
        this.receiverAccountId = (long)receiverAccountId;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getSenderAccountId() {
        return this.senderAccountId;
    }

    public void setSenderAccountId(long senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public long getReceiverAccountId() {
        return this.receiverAccountId;
    }

    public void setReceiverAccountId(long receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }
}
