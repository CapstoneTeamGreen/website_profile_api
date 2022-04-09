package com.ganggreen.configuration;

import com.ganggreen.model.Profile;
import com.ganggreen.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DatabaseSeedConfiguration {

    private final ProfileService service;

    @Autowired
    public DatabaseSeedConfiguration(ProfileService service) {
        this.service = service;
    }

    @PostConstruct
    public void initialize() {
        Profile profile = new Profile();

        profile.setAboutMe("About me");
        profile.setAuthorName("NSCC Student");
        profile.setDeveloperType("Full-stack Developer");
        profile.setEmail("w0000000@nscc.ca");

        service.create(profile);
    }

}
