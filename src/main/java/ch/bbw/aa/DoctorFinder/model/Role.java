package ch.bbw.aa.DoctorFinder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 *
 * @author Abdullah Al-Kubaisi
 * @version 20.12.2022
 */

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "roleid", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleid;
    @Column(name = "role", nullable = false)
    private Rolename Rolename;
    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<Person> persons = new ArrayList<Person>();
}
