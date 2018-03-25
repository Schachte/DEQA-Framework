package commons.impl;

import core.framework.commons.DEQAItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DEQAItemImpl implements DEQAItem {

    // Somehow incorporate security attributes to a DEQAItem for permission access
    private String itemOriginator;
    private String itemCreationStamp;

    public DEQAItemImpl(String itemOriginator) {
        this.itemOriginator = itemOriginator;
        this.itemCreationStamp = getCurrentDateTime();
    }

    public String getCurrentDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    protected String getItemOriginator() {
        return itemOriginator;
    }

    protected String getItemCreationStamp() {
        return itemCreationStamp;
    }
}
