package commons.impl;

import core.framework.commons.DEQAItem;
import core.framework.commons.DEQARequest;
import core.framework.commons.DEQAResponse;

public class DEQARequestImpl implements DEQARequest {
    public boolean verifyRequest(DEQAItem inputReqItem) {
        return false;
    }

    public DEQAResponse processRequest(DEQAItem inputReqItem) {
        return null;
    }
}
