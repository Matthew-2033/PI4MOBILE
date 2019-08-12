package com.br.academiamobile.mvvm.views.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.br.academiamobile.R;
import com.br.academiamobile.databinding.LoginActivityBinding;
import com.br.academiamobile.mvvm.viewModels.login.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    public LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LoginActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.login_activity);

        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        binding.setLoginViewModel(loginViewModel);
        binding.setLifecycleOwner(this);
    }
}