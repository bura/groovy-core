package groovy.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Andrey Bloschetsov
 */
public class GsonSerializerImpl implements DataSerializer {

    private Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();

    public String serialize(Object data) {
        return gson.toJson(data);
    }

}
