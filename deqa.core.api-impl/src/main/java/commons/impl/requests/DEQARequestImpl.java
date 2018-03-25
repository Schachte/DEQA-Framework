package commons.impl.requests;

import commons.impl.DEQAQuestionImpl;
import core.framework.commons.DEQAItem;
import core.framework.commons.DEQARequest;
import core.framework.commons.DEQAResponse;
import middleware.impl.MiddlewareService;

public abstract class DEQARequestImpl implements DEQARequest {

    public DEQARequestImpl() {}

    public DEQARequestImpl(DEQAItem deqaItem)  {
        // This is where we want to invoke the middleware service
        MiddlewareService.processMiddleware(deqaItem);
    }

    public boolean verifyRequest(DEQAItem inputReqItem) {
        return false;
    }

    public DEQAResponse processRequest(DEQAItem inputReqItem) {
        return null;
    }
}
