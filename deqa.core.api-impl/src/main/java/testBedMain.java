import commons.impl.requests.DEQAResponseImpl;
import core.framework.commons.DEQAResponse;

public class testBedMain {

    /**
     * The purpose of this test is to demonstrate the useage of processing automated middleware when
     * creating custom requests within the framework
     * @param args
     */
    public static void main(String[] args) {
        /**
         * UNDERSTANDING THE ENTIRE WORKFLOW
         * 1) We make an HTTP request/Socket request to an endpoint like you see below (storeNewQuestion)
         * 2) We probably will have a factory class that will determine what type of object to create (in this case, a questionImpl object)
         * 3) Now.. Before we send this data ANYWHERE in the framework, we turn it into a request to pass around (almost like a little packet of data)
         * 4) Literally anything that is of type DEQAREQUEST will automatically invoke the middleware service
         */
        DEQAResponse response = DummyEndpoint.storeNewQuestion("When will we go cloud native mister.");

        // Log the response made by the calls
        System.out.println(response.deserialize());
    }
}
