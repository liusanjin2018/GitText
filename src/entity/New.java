package entity;

import java.util.Date;

public class New {
    private String id;
    private String title;
    private Date sendtime;

    public New(String id, String title, Date sendtime) {
        this.id = id;
        this.title = title;
        this.sendtime = sendtime;
    }

    public New() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}
