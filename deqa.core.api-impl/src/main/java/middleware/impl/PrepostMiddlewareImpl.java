package middleware.impl;

import core.framework.commons.DEQARequest;
import core.framework.middleware.prepost.PrepostMiddleware;

public class PrepostMiddlewareImpl implements PrepostMiddleware {
    public PrepostMiddlewareImpl() {}

    public boolean checkPermissions(DEQARequest inputReq) {
        return inputReq != null ? true : false;
    }
}
