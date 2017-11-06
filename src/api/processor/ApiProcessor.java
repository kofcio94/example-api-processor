package api.processor;

public interface ApiProcessor {
    Response doPost(Request request);
    Response doGet(Request request);
    Response doPut(Request request);
    Response doDelete(Request request);
}
