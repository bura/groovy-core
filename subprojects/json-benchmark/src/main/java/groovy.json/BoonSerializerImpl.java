package groovy.json;

import org.boon.json.JsonSerializer;
import org.boon.json.JsonSerializerFactory;

/**
 * @author Andrey Bloschetsov
 */
public class BoonSerializerImpl implements DataSerializer {

    private final JsonSerializer serializer = new JsonSerializerFactory().create();

    public String serialize(Object data) {
        return serializer.serialize(data).toString();
    }

}
