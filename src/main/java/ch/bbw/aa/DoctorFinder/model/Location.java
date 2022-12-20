package ch.bbw.aa.DoctorFinder.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Location
 *
 * @author Abdullah Al-Kubaisi
 * @version 20.12.2022
 */

@Entity
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "locationid", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int locationid;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private int plz;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String canton;

    @OneToMany(mappedBy = "person")
    private List<Roster> rosterList = new ArrayList<Roster>();

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public List<Roster> getRosterList() {
        return rosterList;
    }

    public void setRosterList(List<Roster> rosterList) {
        this.rosterList = rosterList;
    }
}
