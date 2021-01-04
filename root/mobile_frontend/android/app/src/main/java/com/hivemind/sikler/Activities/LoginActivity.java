package com.hivemind.sikler.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hivemind.sikler.R;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText inputLogin;
    private EditText inputPassword;
    private TextView resetPass;
    private TextView gotoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLogin = findViewById(R.id.et_login);
        inputPassword = findViewById(R.id.et_pass);
        loginBtn = findViewById(R.id.login_btn);
        resetPass = findViewById(R.id.tv_reset_pass);
        gotoRegister = findViewById(R.id.tv_go_to_register);

        String userLogin = inputLogin.getText().toString().trim();
        String userPass = inputPassword.getText().toString().trim();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser(userLogin, userPass);
            }
        });

        resetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPassword();
            }
        });

        gotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoRegister();
            }
        });

    }

    void loginUser(String l, String p){
        try {
            //code
        }catch (Exception exc ){
            System.out.println(exc);
        }
    }

    void resetPassword(){

    }

    void gotoRegister(){
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}