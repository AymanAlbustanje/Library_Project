/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

public class Journal extends Book {
    private int conferenceNo;
    private int issueNo;

    public Journal(String title, Author author, int no, String genre, int version, String date,
                   boolean onLoan, int conferenceNo, int issueNo) {
        super(title, author, no, genre, version, date, onLoan);
        this.conferenceNo = conferenceNo;
        this.issueNo = issueNo;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }
    
    
    

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    

    @Override
    public String getInfo() {
        return String.format("%s%nJournal Information:%nConference Number: %d%nIssue Number: %d",
                super.getInfo(), conferenceNo, issueNo);
    }
    
    
}

