package contract.transferables;

import java.io.Serializable;
import contract.Contract;

public class TransactionTransferable implements Contract<TransactionTransferable>, Serializable {

    private long amount;
    private long timestamp;

    public TransactionTransferable(long amount, long timestamp) {
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount){
        this.amount = amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
