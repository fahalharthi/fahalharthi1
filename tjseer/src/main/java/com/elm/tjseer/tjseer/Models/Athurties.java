package com.elm.tjseer.tjseer.Models;

import com.elm.tjseer.tjseer.Models.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Authority")
public class Athurties {

    @Id
    private int athurtyID;
    @Column
    private  String authrtyName;
    @Column
    private String authrtyDescrip;


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @OneToMany(mappedBy = "authority", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();


    public int getAthurtyID() {
        return athurtyID;
    }

    public void setAthurtyID(int athurtyID) {
        this.athurtyID = athurtyID;
    }

    public String getAuthrtyName() {
        return authrtyName;
    }

    public void setAuthrtyName(String authrtyName) {
        this.authrtyName = authrtyName;
    }

    public String getAuthrtyDescrip() {
        return authrtyDescrip;
    }

    public void setAuthrtyDescrip(String authrtyDescrip) {
        this.authrtyDescrip = authrtyDescrip;
    }
}
