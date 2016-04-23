package com.example.marieanne.spot.Data;

/**
 * Created by etcheverrymayalen on 15/04/2016.
 */
public class Event {

private String title;
private String type;
private int picture;
private String description;
private String motClé;


public Event(String title, String type, int picture, String description, String motClé) {
if (title == null) {
    throw new NullPointerException();
}
if (description == null) {
    throw new NullPointerException();
}

this.title = title;
this.type = type;
this.picture = picture;
this.description = description;
this.motClé=motClé;
}

public String getTitle() {
return title;
}

public String getDescription() {
return description;
}

public int getPicture() {
return picture;
}

public String getType() {
return type;
}

public String getMotClé() {
return motClé;
}
}


/* public boolean equals(Object obj)
        {
            return (!(obj instanceof Account)) ? false :
                    pseudo.equals(((Account) obj).getPseudo());
        }

        public int hashCode()
        {
            return pseudo.hashCode();
        }*/