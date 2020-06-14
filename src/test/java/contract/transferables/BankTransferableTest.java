package contract.transferables;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTransferableTest {

    BankTransferable bt;

    @Before
    public void setup(){
        bt = new BankTransferable("100","testBank");
    }

    @After
    public void tearDown(){
        bt = null;
    }

    @Test
    public void getAndSetCvr() {
        Assert.assertEquals("100", bt.getCvr());
        bt.setCvr("101");
        Assert.assertEquals("101", bt.getCvr());
    }

    @Test
    public void getAndSetName() {
        Assert.assertEquals("testBank", bt.getName());
        bt.setName("newTestBank");
        Assert.assertEquals("newTestBank", bt.getName());
    }

}
