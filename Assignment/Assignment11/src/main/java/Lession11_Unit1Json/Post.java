package Lession11_Unit1Json;

import java.util.Date;

public class Post {
    private String title;
    private long id;
    private String Description;
    private String content;
    private Date lastUpdatedAt;
    private Date postedAt;
public Post(){}
    public Post(String title, long id, String description, String content, Date lastUpdatedAt, Date postedAt) {
        this.title = title;
        this.id = id;
        Description = description;
        this.content = content;
        this.lastUpdatedAt = lastUpdatedAt;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }
}
