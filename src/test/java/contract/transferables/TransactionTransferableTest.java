package contract.transferables;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransactionTransferableTest {

    TransactionTransferable tt;

    @Before
    public void setup(){
        tt = new TransactionTransferable(100L,1000L);
    }

    @After
    public void tearDown(){
        tt = null;
    }

    @Test
    public void getAndSetAmount() {
        Assert.assertEquals(100L, tt.getAmount());
        tt.setAmount(1000L);
        Assert.assertEquals(1000L, tt.getAmount());
    }

    @Test
    public void getAndSetTimestamp() {
        Assert.assertEquals(1000L, tt.getTimestamp());
        tt.setTimestamp(10000L);
        Assert.assertEquals(10000L, tt.getTimestamp());
    }

}
