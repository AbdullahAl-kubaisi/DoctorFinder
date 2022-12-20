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


}
