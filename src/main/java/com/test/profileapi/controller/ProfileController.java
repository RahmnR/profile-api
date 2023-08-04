package com.test.profileapi.controller;

import com.test.profileapi.entity.Profile;
import com.test.profileapi.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/profile")
public class ProfileController {
    private final ProfileService profileService;
    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    Profile create(@RequestBody Profile profile){
        return profileService.insert(profile);
    }

    @GetMapping
    List<Profile> viewAll(){
        return profileService.getAll();
    }

}
