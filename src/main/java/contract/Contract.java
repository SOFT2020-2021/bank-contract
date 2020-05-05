package contract;

import java.io.IOException;
import java.io.Serializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import contract.transferables.CustomerIdsTransferable;

public interface Contract<T extends Serializable> {

    default String toJSON() throws IOException {
        return new ObjectMapper().writeValueAsString(this);
    }
}
