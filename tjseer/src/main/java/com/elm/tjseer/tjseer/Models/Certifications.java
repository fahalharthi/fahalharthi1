package com.elm.tjseer.tjseer.Models;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Certifications")
public class Certifications {
    @Id
    private int certsID;
    @Column
    private String certstName;
    @Column
    private String certsType;
    @Column
    private String certDescrip;
    @Column
    private String certsStatuse;
    @Column
    private String certsDocuments;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Organizations.class)
    @JoinColumn(name = "OrganizationID")
    private Organizations organization;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "certificates_shareds",
            joinColumns = {@JoinColumn(name = "certsID")},
            inverseJoinColumns = {@JoinColumn(name = "shareID")}
    )
    private Set<Shares> shares = new HashSet<Shares>();



    public Set<Shares> getShares() {
        return shares;
    }

    public void setShares(Set<Shares> shares) {
        this.shares = shares;
    }

    public Organizations getOrganization() {
        return organization;
    }


    public void setOrganization(Organizations organization) {
        this.organization = organization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//        private enum for doc type;


    public String getCertsType() {
        return certsType;
    }

    public void setCertsType(String certsType) {
        this.certsType = certsType;
    }

    public String getCertDescrip() {
        return certDescrip;
    }

    public void setCertDescrip(String certDescrip) {
        this.certDescrip = certDescrip;
    }

    public String getCertsStatuse() {
        return certsStatuse;
    }

    public void setCertsStatuse(String certsStatuse) {
        this.certsStatuse = certsStatuse;
    }

    public String getCertsDocuments() {
        return certsDocuments;
    }

    public void setCertsDocuments(String certsDocuments) {
        this.certsDocuments = certsDocuments;
    }

    public int getCertsID() {
        return certsID;
    }

    public void setCertsID(int certsID) {
        this.certsID = certsID;
    }

    public String getCertstName() {
        return certstName;
    }

    public void setCertstName(String certstName) {
        this.certstName = certstName;
    }
}
