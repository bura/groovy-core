package groovy.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Andrey Bloschetsov
 */
public class JacksonSerializerImpl implements DataSerializer {

    private final ObjectMapper mapper = initMapper();

    private ObjectMapper initMapper() {
        ObjectMapper m = new ObjectMapper().enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING).disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        m.setDateFormat(formatter);

        return m;
    }

    public String serialize(Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();

            return null;
        }
    }

}
