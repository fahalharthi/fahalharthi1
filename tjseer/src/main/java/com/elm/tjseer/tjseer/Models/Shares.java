package com.elm.tjseer.tjseer.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "Shares")
public class Shares {

    @Id
    private int shareID;
    @Column
    private  String shareDecument;
    @Column
    private String URL;



    @ManyToOne(cascade = CascadeType.ALL , targetEntity = User.class)
    @JoinColumn(name = "userID")
    private User userID;

    @ManyToMany(mappedBy = "shares", cascade = {CascadeType.ALL}, targetEntity = Certifications.class)
    private Set<Certifications> certificates = new HashSet<Certifications>();


    public Shares(){}

    public Shares(int shareID, String shareDecument, String URL, User userID, Set<Certifications> certificates) {
        this.shareID = shareID;
        this.shareDecument = shareDecument;
        this.URL = URL;
        this.userID = userID;
        this.certificates = certificates;
    }

    public int getShareID() {
        return shareID;
    }

    public void setShareID(int shareID) {
        this.shareID = shareID;
    }

    public String getShareDecument() {
        return shareDecument;
    }

    public void setShareDecument(String shareDecument) {
        this.shareDecument = shareDecument;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
