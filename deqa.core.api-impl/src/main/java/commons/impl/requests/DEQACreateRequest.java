package commons.impl.requests;

import core.framework.commons.DEQAItem;
import core.framework.commons.DEQAResponse;

public class DEQACreateRequest extends DEQARequestImpl {

    DEQAItem inputItem;

    public DEQACreateRequest(DEQAItem inputItem) {
        super(inputItem);
        this.inputItem = inputItem;
    }

    public DEQAResponse create() {
        return new DEQAResponseImpl(this.inputItem);
    }
}
