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

}
