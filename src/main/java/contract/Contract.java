package contract;

import java.io.IOException;
import java.io.Serializable;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface Contract<T extends Serializable> {

    default String toJSON() throws IOException {
        return new ObjectMapper().writeValueAsString(this);
    }
}
