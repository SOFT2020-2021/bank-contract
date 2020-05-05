package contract.transferables;

import contract.JSON;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TransactionActivityTransferableTest {

    TransactionActivityTransferable tat;

    @Before
    public void setup(){
        tat = new TransactionActivityTransferable(100L,100L, 100L);
    }

    @After
    public void tearDown(){
        tat = null;
    }

    @Test
    public void getAndSetAmount() {
        Assert.assertEquals(100L, tat.getAmount());
        tat.setAmount(1000L);
        Assert.assertEquals(1000L, tat.getAmount());
    }

    @Test
    public void getTransactionActivityTransferableFromJSON() throws IOException {
        JSON json = new JSON();
        TransactionActivityTransferable tatFromJSON = json.fromJSONTransactionActivity("{\"senderAccountId\" : 123, \"receiverAccountId\" : 102, \"amount\" : 100}");

        Assert.assertEquals(tatFromJSON.getAmount(), 100L);

    }
}
