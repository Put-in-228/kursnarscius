package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;

public class BasicJsonConverter implements DataParserer {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String toJson(RequestData data) {
        try {
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T fromJson(String json, Class<T> type) {
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
