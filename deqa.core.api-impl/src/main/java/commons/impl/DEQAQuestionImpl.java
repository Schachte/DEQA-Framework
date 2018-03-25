package commons.impl;

import commons.impl.requests.DEQARequestImpl;
import core.framework.commons.Rating;

import java.util.List;

public class DEQAQuestionImpl extends DEQAItemImpl {

    //TODO: Do we want to make this a JAXB XML element instead for cleaner serialization?
    private String questionBody;
    private boolean answered;
    private List<DEQARequestImpl> responses;
    private Rating rating;
    private boolean spamLock;

    public DEQAQuestionImpl(String itemOriginator, String questionBody) {
        this(itemOriginator);
        this.rating = new RatingImpl();
        this.questionBody = questionBody;
    }

    private DEQAQuestionImpl(String itemOriginator) {
        super(itemOriginator);
    }

    void upvoteQuestion() {
        this.rating.upVote();
    }

    void downvoteQuestion() {
        this.rating.downVote();
    }

    int getQuestionRating() {
        return this.rating.getRating();
    }

    boolean determineSpamLock() {
        int spamReportables = this.rating.getSpamReportables();
        return false;
    }
}
