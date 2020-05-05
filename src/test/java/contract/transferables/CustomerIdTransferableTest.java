package contract.transferables;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerIdTransferableTest {
    CustomerIdsTransferable cit;

    @Before
    public void setup(){
        List<String> l = new ArrayList<>();
        l.add("112");
        cit = new CustomerIdsTransferable(l);
    }

    @After
    public void tearDown(){
        cit = null;
    }


}
