package api.processor;

import java.net.HttpURLConnection;
import java.util.Map;

public class Response {

    private Map<String, String> headers;
    private String body;
    private int responseCode;

    public Response(Map<String, String> headers, String body, int responseCode) {
        this.headers = headers;
        this.body = body;
        this.responseCode = responseCode;
    }

    public Response() {
        this.responseCode = HttpURLConnection.HTTP_NOT_IMPLEMENTED;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
