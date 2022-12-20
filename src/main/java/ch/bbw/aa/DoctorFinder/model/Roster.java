package ch.bbw.aa.DoctorFinder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.crypto.Data;

/**
 * Roster
 *
 * @author Abdullah Al-Kubaisi
 * @version 20.12.2022
 */

@Entity
@Table(name = "roster")
public class Roster {

    @Id
    @Column(name = "rosterid", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int rosterid;
    @Column(nullable = false)
    private Data from;
    private Data to;
    private String comment;

    @OneToOne
    @JoinColumn(name = "personidfs", insertable = true, updatable = true)
    private Person person;

    @ManyToOne
    @JsonIgnore
    private Location location;

    public int getRosterid() {
        return rosterid;
    }

    public void setRosterid(int rosterid) {
        this.rosterid = rosterid;
    }

    public Data getFrom() {
        return from;
    }

    public void setFrom(Data from) {
        this.from = from;
    }

    public Data getTo() {
        return to;
    }

    public void setTo(Data to) {
        this.to = to;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
