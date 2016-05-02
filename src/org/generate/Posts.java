package org.generate;
// Generated Apr 30, 2016 12:05:45 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Posts generated by hbm2java
 */
public class Posts  implements java.io.Serializable {


     private int postUuid;
     private String title;
     private String content;
     private Date publishingDate;

    public Posts() {
    }

	
    public Posts(String title, String content) {
        this.title = title;
        this.content = content;
        this.publishingDate = new Date();
    }
    
  
    public int getPostUuid() {
        return this.postUuid;
    }
    
    public void setPostUuid(int postUuid) {
        this.postUuid = postUuid;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public Date getPublishingDate() {
        return this.publishingDate;
    }
    
    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

}

