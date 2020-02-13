package com.elm.tjseer.tjseer.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Organizations")
public class Organizations {

    @Id
    private int orgID;
    @Column
    private String orgName;
    @Column
    private String address;
    @Column
    private  String contact;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL , targetEntity = Certifications.class)
    private List<Certifications> certificates = new ArrayList<>();


    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Certifications> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certifications> certificates) {
        this.certificates = certificates;
    }





}
