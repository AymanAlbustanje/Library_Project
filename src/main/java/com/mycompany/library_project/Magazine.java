/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

public class Magazine extends Book {
    private int issueNo;
    private String releaseDate;

    public Magazine(String title, Author author, int no, String genre, int version, String date,
                    boolean onLoan, int issueNo, String releaseDate) {
        super(title, author, no, genre, version, date, onLoan);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    

    @Override
    public String getInfo() {
        return String.format("%s%nMagazine Information:%nIssue Number: %d%nRelease Date: %s",
                super.getInfo(), issueNo, releaseDate);
    }
    
    
}

