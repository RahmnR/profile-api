package com.test.profileapi.repository;

import com.test.profileapi.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    @Modifying
    @Query(value = "INSERT INTO m_profile(id,birthday,city,country,email,first_name,last_name,address) " +
            "VALUES (:id,:birth,:city,:country,:email,:firstName,:lastName,:address)",nativeQuery = true)
    void inputdata(@Param("id")Integer id, @Param("birth")LocalDate birthdate,@Param("city")String city,
                   @Param("country")String country, @Param("email")String email,@Param("firstName")String firstName,
                   @Param("lastName")String lastName, @Param("address")Double address);

    @Query(value = "SELECT * FROM m_profile",nativeQuery = true)
    List<Profile> viewAll();

    @Query(value = "SELECT * FROM m_profile WHERE id = :id",nativeQuery = true)
    Profile getById(@Param("id")Integer id);
}
