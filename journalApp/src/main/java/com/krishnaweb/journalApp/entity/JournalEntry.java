package com.krishnaweb.journalApp.entity;

public class JournalEntry {

    private  long id;
    private  String title;
    private String content;
   // private  String about;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

//    public  void setAbout(String about){
//          this.about = about;
//    }
//

//    public String getAbout() {
//        return about;
//    }

    public void setContent(String content) {
        this.content = content;
    }
}
