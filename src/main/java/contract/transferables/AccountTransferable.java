package contract.transferables;

import contract.Contract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountTransferable implements Contract<AccountTransferable>, Serializable {
    private int bankCvr;
    private int customerCpr;
    private int number;
    private long balance = 0L;
    private List<TransactionTransferable> transactions = new ArrayList();

    public AccountTransferable() {
    }

    public AccountTransferable(int customerCpr, int bankCvr, int number, long balance) {
        this.customerCpr = customerCpr;
        this.bankCvr = bankCvr;
        this.number = number;
        this.balance = balance;
    }

    public int getBankCvr() {
        return this.bankCvr;
    }

    public void setBankCvr(int bankCvr) {
        this.bankCvr = bankCvr;
    }

    public int getCustomerCpr() {
        return this.customerCpr;
    }

    public void setCustomerCpr(int customerCpr) {
        this.customerCpr = customerCpr;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<TransactionTransferable> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<TransactionTransferable> transactions) {
        this.transactions = transactions;
    }
}
