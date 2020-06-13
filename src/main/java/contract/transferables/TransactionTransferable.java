package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class TransactionTransferable implements Contract<TransactionTransferable>, Serializable {
    private long amount;
    private long timestamp;

    public TransactionTransferable() {
    }

    public TransactionTransferable(long amount, long timestamp) {
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
