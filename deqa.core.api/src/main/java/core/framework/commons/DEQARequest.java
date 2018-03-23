package core.framework.commons;

/**
 * All requests running through the DEQA framework will be processed through
 * the means of a DEQA request
 */
public interface DEQARequest {
    boolean verifyRequest(DEQAItem inputReqItem);
    DEQAResponse processRequest(DEQAItem inputReqItem);
}
