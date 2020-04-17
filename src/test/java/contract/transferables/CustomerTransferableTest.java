package contract.transferables;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTransferableTest {

    CustomerTransferable ct;

    @Before
    public void setup(){
        ct = new CustomerTransferable(201287, "Alex");
    }

    @After
    public void tearDown(){
        ct = null;
    }

    @Test
    public void getAndSetCpr() {
        Assert.assertEquals(201287, ct.getCpr());
        ct.setCpr(201020);
        Assert.assertEquals(201020, ct.getCpr());
    }

    @Test
    public void getAndSetName() {
        Assert.assertEquals("Alex", ct.getName());
        ct.setName("Alexander");
        Assert.assertEquals("Alexander", ct.getName());
    }

}
