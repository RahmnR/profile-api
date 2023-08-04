package com.test.profileapi.service;

import com.test.profileapi.entity.Profile;

import java.util.List;

public interface ProfileService {
    Profile insert(Profile profile);
    List<Profile> getAll();
}
