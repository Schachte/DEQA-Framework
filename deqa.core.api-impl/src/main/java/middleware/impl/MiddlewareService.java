package middleware.impl;

import core.framework.commons.DEQAItem;
import core.framework.commons.DEQARequest;

/**
 * This class is responsible for executing all middleware plugins within the framework
 * - Should we tag requests with specific attributes to determine if they need to run through specific middlewares?
 */
public class MiddlewareService {
    public MiddlewareService() {}

    public static void processMiddleware(DEQAItem req) {
        runSecurityMiddleware(req);
        runPreCreateMiddleware(req);
    }

    /**
     * Intercept request to verify all security involved with the new request
     */
    private static void runSecurityMiddleware(DEQAItem req) {
        /**
         * This is where we would loop through all classes implementing the securityMiddleware interface and run their functions
         */
        System.out.println("The security middleware is automatically running for this createRequest");
    }

    /**
     * Intercept the request to attach/process any metadata to requests before running through the framework
     */
    private static void runPreCreateMiddleware(DEQAItem req) {
        /**
         * This is where we would loop through all classes implementing the runPreCreateMiddleware interface and run their functions
         */
        System.out.println("The pre-create middleware is automatically running on this createRequest");
    }
}
