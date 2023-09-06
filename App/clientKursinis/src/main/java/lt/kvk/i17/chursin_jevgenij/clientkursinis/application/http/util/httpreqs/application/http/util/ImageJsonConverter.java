package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util;

import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;

public class ImageJsonConverter implements DataParserer {

    @Override
    public String toJson(RequestData data) {
        return null;
        //Image file to bytes and add it to JSON
    }

    @Override
    public <T> T fromJson(String json, Class<T> type) {
        return null;
        //Get the data and convert bytes to image file
    }
}
