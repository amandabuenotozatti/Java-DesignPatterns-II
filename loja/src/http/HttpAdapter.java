package http;

import java.util.Map;

public interface HttpAdapter {

    default void post(String url, Map<String, Object> dados) {

    }


}
