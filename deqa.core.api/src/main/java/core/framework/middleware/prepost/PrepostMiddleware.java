package core.framework.middleware.prepost;

import core.framework.commons.DEQARequest;

/**
 * Java interface that can wrap any class which should be executed on a
 * pre-post request within the framework.
 */
public interface PrepostMiddleware {
    boolean checkPermissions(DEQARequest inputReq);
}
