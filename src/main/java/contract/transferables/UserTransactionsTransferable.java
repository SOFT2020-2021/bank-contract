package contract.transferables;

import contract.Contract;
import java.io.Serializable;
import java.util.List;

public class UserTransactionsTransferable implements Contract<UserTransactionsTransferable>, Serializable {
    List<UserTransaction> transactions;

    public UserTransactionsTransferable() {
    }

    public UserTransactionsTransferable(List<UserTransaction> transactions) {
        this.transactions = transactions;
    }

    public List<UserTransaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<UserTransaction> transactions) {
        this.transactions = transactions;
    }
}
