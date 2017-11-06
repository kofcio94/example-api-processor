package api.processor;

public class LocalServer {

    //todo implement localhostServer
    public Response serve(Request request) {
        return request.executeService();
    }
}
