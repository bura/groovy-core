package groovy.json;

import java.util.Map;

/**
 * @author Andrey Bloschetsov
 */
public class NewGroovySerializerImpl implements DataSerializer {

    public String serialize(Object data) {
        return NewJsonOutput.toJson(data);
    }

}
