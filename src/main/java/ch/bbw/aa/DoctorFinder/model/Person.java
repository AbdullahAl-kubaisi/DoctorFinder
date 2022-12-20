package ch.bbw.aa.DoctorFinder.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Person
 *
 * @author Abdullah Al-Kubaisi
 * @version 20.12.2022
 */

@Entity
@Table(name = "person")

public class Person {

    @Id
    @Column(name = "personid", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int personid;

    @Column(name = "title")
    private String title;


    @Column(name = "firstname", nullable = false)
    private String firstname;


    @Column(name = "lastname", nullable = false)
    private String lastname;


    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "service", nullable = false)
    private String service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleidfs")
    @JsonIgnore
    private Role role;

    @OneToOne(mappedBy = "person")
    private Roster roster;


}
