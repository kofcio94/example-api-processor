package api.exampleServices;

import api.processor.ApiProcessor;
import api.processor.Request;
import api.processor.Response;

public class FeedbackService implements ApiProcessor {

    @Override
    public Response doPost(Request request) {
        // do stuff ....
        return new Response();
    }

    @Override
    public Response doGet(Request request) {
        return null;
    }

    @Override
    public Response doPut(Request request) {
        return null;
    }

    @Override
    public Response doDelete(Request request) {
        return null;
    }

}
