package core.framework.commons;

import core.framework.exceptions.InvalidInstanceException;

public interface Rating {
    /**
     * Allows a user to upvote a particular DeqaQuestion
     */
    void upVote();

    /**
     * Allows a user to downvote a particular DeqaQuestion
     */
    void downVote();

    /**
     * Allows a user to report a DeqaQuestion for spam content
     */
    void reportSpam();

    /**
     *
     * @return the current rating of the DeqaQuestion
     */
    int getRating();

    /**
     *
     * @return Number of times a user has reported a specific DEQAQuestion as spam
     */
    int getSpamReportables();
}
