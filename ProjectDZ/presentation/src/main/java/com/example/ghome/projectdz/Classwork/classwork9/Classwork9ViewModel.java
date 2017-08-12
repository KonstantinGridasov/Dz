package com.example.ghome.projectdz.Classwork.classwork9;

import android.app.Activity;
import android.databinding.ObservableField;

import com.example.domain.entry.Profile;
import com.example.domain.entry.ProfileID;
import com.example.domain.interaction.ProfileUseCase;
import com.example.ghome.projectdz.base.BaseViewModel;

/**
 * Created by GHome on 11.08.2017.
 */

public class Classwork9ViewModel  implements BaseViewModel {

    public enum STATE {PROGRESS,DATA}


    public ObservableField<String> m9Name=new ObservableField<>("");
    public ObservableField<String> m9Surname=new ObservableField<>("");
    public ObservableField<Integer> m9Age=new ObservableField<>(2);
    public ObservableField<STATE> mState =new ObservableField<>(STATE.PROGRESS);
    public Activity mActivity;

    private ProfileUseCase useCase =new ProfileUseCase();

    public Classwork9ViewModel (Activity activity)
    {
        mActivity=activity;
    }


    @Override
    public void init() {

    }

    @Override
    public void release() {


    }

    @Override
    public void resume() {
        ProfileID profileID =new ProfileID();
        profileID.setId("123");
        Profile profile =useCase.execute(profileID);

        m9Name.set(profile.getName());
        m9Surname.set(profile.getSurname());
        m9Age.set(profile.getAge());

        mState.set(STATE.DATA);
    }

    @Override
    public void pause() {

    }


}
