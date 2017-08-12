package com.example.domain.interaction;

import com.example.domain.entry.Profile;
import com.example.domain.entry.ProfileID;
import com.example.domain.interaction.base.UseCase;

/**
 * Created by GHome on 11.08.2017.
 */

public class ProfileUseCase extends UseCase <ProfileID,Profile> {
    @Override
    protected Profile buildUseCase() {
        Profile profile =new Profile();
        profile.setName("Name");
        profile.setAge(20);
        profile.setSurname("Surname");



        return profile;
    }
}
