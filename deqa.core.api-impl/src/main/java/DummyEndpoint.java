import commons.impl.DEQAQuestionImpl;
import commons.impl.requests.DEQACreateRequest;
import commons.impl.requests.DEQARequestImpl;
import core.framework.commons.DEQAItem;
import core.framework.commons.DEQAResponse;

public class DummyEndpoint extends DEQARequestImpl {
    public DummyEndpoint() {}

    public static DEQAResponse storeNewQuestion(String userInput) {

        // First, we need to normalize the input data to be in an object recognized by the framework (DEQAItem)
        DEQAItem newReqItem = new DEQAQuestionImpl("Dummy user", userInput);
        DEQAResponse res = new DEQACreateRequest(newReqItem).create();
        return res;
    }
}
