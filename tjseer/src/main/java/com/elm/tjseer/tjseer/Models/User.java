package com.elm.tjseer.tjseer.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AllUsers")

public class User {

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public List<Shares> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shares> shareds) {
        this.shareds = shareds;
    }

    @Column
    private String userFullName;
    @Id
    private int userID;
    @Column
    private int phoneNumber;
    @Column
    private Date birthDay;
    @Column
    private String email;
    @Column
    private String passwordHash;
    @Column
    private int natID;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Certifications> certificates = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthorityID")
    private Athurties authority;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrganizationID")
    private Organizations userOrganization;


    @OneToMany(mappedBy = "userID", cascade = CascadeType.ALL , targetEntity = Shares.class)
    private List<Shares> shareds = new ArrayList<>();



    public int getUserID() {

        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<Certifications> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certifications> certificates) {
        this.certificates = certificates;
    }

    public Athurties getAuthority() {
        return authority;
    }

    public void setAuthority(Athurties authority) {
        this.authority = authority;
    }

    public Organizations getUserOrganization() {
        return userOrganization;
    }

    public void setUserOrganization(Organizations userOrganization) {
        this.userOrganization = userOrganization;
    }

    public User() {

    }
    public User(int userid, int phoneNumber, Date birthDay, String email) {
        this.userID = userid;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.email = email;
    }

    public int getNatID() {
        return natID;
    }

    public void setNatID(int natID) {
        this.natID = natID;
    }

    public int getUserid() {
        return userID;
    }

    public void setUserid(int userid) {
        this.userID = userid;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
