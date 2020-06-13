package contract.transferables;

public class UserTransaction {
    private String retrieverName;
    private String giverName;
    private String timestamp;
    private long amount;

    public UserTransaction() {
    }

    public UserTransaction(String retrieverName, String giverName, String timestamp, long amount) {
        this.retrieverName = retrieverName;
        this.giverName = giverName;
        this.timestamp = timestamp;
        this.amount = amount;
    }

    public String getRetrieverName() {
        return this.retrieverName;
    }

    public void setRetrieverName(String retrieverName) {
        this.retrieverName = retrieverName;
    }

    public String getGiverName() {
        return this.giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}