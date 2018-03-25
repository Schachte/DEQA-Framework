package commons.impl.requests;

import commons.impl.DEQAItemImpl;
import core.framework.commons.DEQAItem;
import core.framework.commons.DEQAResponse;

public class DEQAResponseImpl implements DEQAResponse {

    DEQAItem inputItem;

    public DEQAResponseImpl(DEQAItem inputItem) {
        this.inputItem = inputItem;
    }

    public String deserialize() {
        // Dummy deserialization method that returns the creation time of the original request item
        return ((DEQAItemImpl) inputItem).getCurrentDateTime();
    }
}
