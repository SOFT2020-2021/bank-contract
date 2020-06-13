package contract.transferables;

public class SimpleAccountTransferable {
    private int balance;
    private int id;

    public SimpleAccountTransferable(int balance, int id) {
        this.balance = balance;
        this.id = id;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
