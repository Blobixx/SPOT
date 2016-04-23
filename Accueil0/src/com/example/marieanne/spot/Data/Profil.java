package com.example.marieanne.spot.Data;

/**
 * Created by etcheverrymayalen on 15/04/2016.
 */

import java.util.List;
import java.util.ArrayList;


public class Profil{

    private String identifiant;
    private String email;
    private String mdp;
    private List<Event> events;


    public Profil(String identifiant, String email, String mdp ){
        this.email = email;
        this.mdp = mdp;
        if(identifiant == null) {
            throw new NullPointerException();
        }
        this.identifiant = identifiant;
        setMailAddress(email);
        setMdp(mdp);
        events = new ArrayList<Event>();
    }


    public String getId() {
        return identifiant;
    }

    public void setMdp(String mdp) {
        if(mdp == null) {
            throw new NullPointerException();
        }
        this.mdp = mdp;
    }

    public String getEMailAddress() {
        return email;
    }

    public void setMailAddress(String email) {
        if(email == null) {
            throw new NullPointerException();
        }
        this.email = email;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void addEvent ( Event event) {
        events.add(event);
    }

/*public boolean equals(Object obj)
    {
        return (!(obj instanceof Account)) ? false :
                pseudo.equals(((Account) obj).getPseudo());
    }

    public int hashCode()
    {
        return pseudo.hashCode();
    }*/

}