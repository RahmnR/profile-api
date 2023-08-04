package com.test.profileapi.service;

import com.test.profileapi.entity.Profile;
import com.test.profileapi.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService{
    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
    @Transactional(rollbackOn = Exception.class)
    @Override
    public Profile insert(Profile profile) {
        profileRepository.inputdata(profile.getId(), profile.getBirthdate(),profile.getCity(),profile.getCountry(),
                profile.getEmail(), profile.getFirstName(), profile.getLastName(), profile.getAddress());
        return profileRepository.getById(profile.getId());
    }

    @Override
    public List<Profile> getAll() {
        return profileRepository.viewAll();
    }
}
