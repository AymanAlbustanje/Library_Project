/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

public class Journal extends Book {
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, Author author, int no, String genre, int version, String date,
                   boolean onLoan, String conferenceName, int conferenceNo) {
        super(title, author, no, genre, version, date, onLoan);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    

    @Override
    public String getInfo() {
        return super.getInfo() + " Journal{" +
                "conferenceName='" + conferenceName + '\'' +
                ", conferenceNo=" + conferenceNo +
                '}';
    }
}

