package com.br.academiamobile.mvvm.viewModels.login;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.br.academiamobile.mvvm.models.login.Login;

public class LoginViewModel extends ViewModel {

    public  MutableLiveData<String> email = new MutableLiveData<>();
    public  MutableLiveData<String> senha = new MutableLiveData<>();

    private MutableLiveData<Login> loginMutableLiveData;

    public LoginViewModel() {
    }

    public LiveData<Login> getLogin() {
        if (loginMutableLiveData == null) {
            loginMutableLiveData = new MutableLiveData<>();
        }

        return loginMutableLiveData;
    }

    public void onLoginClicked() {
        Login user = new Login(email.getValue(), senha.getValue());

    }
}