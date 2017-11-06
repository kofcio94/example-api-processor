package api.processor;

import java.net.HttpURLConnection;
import java.util.Map;

public class Request extends UriMatcher {

    public enum RequestType {
        PUT, POST, GET, DELETE
    }

    private Map<String, String> headers;
    private String body;
    private String uri;
    private RequestType type;

    public Request(Map<String, String> headers, String body, String uri, RequestType type) {
        this.headers = headers;
        this.body = body;
        this.uri = uri;
        this.type = type;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public Response executeService() {
        ApiProcessor processor = getMatchedService(this.uri);
        try {
            return executeMethod(processor);
        } catch (NotImplementedException e) {
            return new Response(null, null, HttpURLConnection.HTTP_NOT_IMPLEMENTED);
        }
    }

    private Response executeMethod(ApiProcessor processor) throws NotImplementedException {
        Response response;
        switch (this.type) {
            case GET:
                response = processor.doGet(this);
                break;
            case PUT:
                response = processor.doPut(this);
                break;
            case POST:
                response = processor.doPost(this);
                break;
            case DELETE:
                response = processor.doDelete(this);
                break;
            default:
                throw new NotImplementedException();
        }

        if (response == null)
            throw new NotImplementedException();

        return response;
    }
}
