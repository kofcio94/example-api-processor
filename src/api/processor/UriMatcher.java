package api.processor;

import api.exampleServices.DownloadService;
import api.exampleServices.FeedbackService;

public class UriMatcher {
    protected UriMatcher() {
    }

    protected ApiProcessor getMatchedService(String uri) {
        uri = uri.toLowerCase();
        switch (uri) {
            case "api/download":
                return new DownloadService();
            case "api/feedback":
                return new FeedbackService();
            default:
                throw new NotImplementedException();
        }
    }
}
