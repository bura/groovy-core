package groovy.json;

import java.util.Map;

/**
 * @author Andrey Bloschetsov
 */
public class GroovySerializerImpl implements DataSerializer {

    public String serialize(Object data) {
        if (data instanceof Map) {
            return JsonOutput.toJson((Map<?, ?>) data);
        } else {
            return JsonOutput.toJson(data);
        }
    }

}
