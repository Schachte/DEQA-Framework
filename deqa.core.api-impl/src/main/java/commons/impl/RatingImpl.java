package commons.impl;

import core.framework.commons.Rating;

public class RatingImpl implements Rating{

    private int rating;              // Current rating count
    private int spamReportables;        // Number of times items reported as spam

    public RatingImpl() {
        this.rating = 0;
    }

    public void upVote() {
        this.rating ++;
    }

    public void downVote() {
        this.rating --;
    }

    public void reportSpam() {
        this.spamReportables++;
    }

    public int getSpamReportables() {
        return this.spamReportables;
    }

    public int getRating() {
        return 0;
    }
}
