package api.exampleServices;

import api.processor.ApiProcessor;
import api.processor.Request;
import api.processor.Response;

public class DownloadService implements ApiProcessor {

    @Override
    public Response doPost(Request request) {
        //do stuff with db/data or etc
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
