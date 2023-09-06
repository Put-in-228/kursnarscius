package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util;

import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;

public interface DataParserer {
    public String toJson(RequestData data);
    public <T> T fromJson(String json, Class<T> type);
}
