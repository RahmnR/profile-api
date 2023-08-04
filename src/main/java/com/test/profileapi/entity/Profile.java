package com.test.profileapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.geom.Arc2D;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_profile")
public class Profile {
    @Column(name = "id", length = 38)
    @Id
    Integer id;
    @Column(name = "first_name", length = 50)
    String firstName;
    @Column(name = "last_name", length = 50)
    String lastName;
    @Column(name = "address")
    Double address;
    @Column(name = "birthday")
    LocalDate birthdate;
    @Column(name = "email", length = 100)
    String email;
    @Column(name = "city", length = 45)
    String city;
    @Column(name = "country", length = 45)
    String country;
}
