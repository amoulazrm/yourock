package com.example.yourock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
public class sign_up extends AppCompatActivity {
    ImageView im2;
    EditText phone, full_name, user_name, password, confpass;
    Button b2, fb;
    TextView text1, sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        im2 = (ImageView) findViewById(R.id.im2);
        phone = (EditText) findViewById(R.id.phone);
        full_name = (EditText) findViewById(R.id.full_name);
        user_name = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);
        confpass = (EditText) findViewById(R.id.confpass);
        text1 = (TextView) findViewById(R.id.text1);
        sign_in = (TextView) findViewById(R.id.sign_in);
        b2 = (Button) findViewById(R.id.b2);
        fb = (Button) findViewById(R.id.fb);
        b2.setOnClickListener(v -> checkDataEntered()
        );
        sign_in.setOnClickListener(v -> startActivity(new Intent(sign_up.this, login.class)));
        fb.setOnClickListener(v -> startActivity(new Intent(sign_up.this, fb_login.class)));
    }

        boolean isEmpty (EditText text){
            CharSequence str = text.getText().toString();
            return TextUtils.isEmpty(str);
        }

        void checkDataEntered () {
        if (isEmpty(phone)) {
                phone.setError("enter your phone number"); }

        else if (isEmpty(full_name)) {
                full_name.setError("full_name is required!");}


        else if (isEmpty(user_name)) {
                user_name.setError("Enter valid user_name!");
            }
        else if (isEmpty(password)) {
                password.setError("Enter valid password");
            }

        else if (isEmpty(confpass)) {
                confpass.setError("Enter correct password");
            }
        else {
            startActivity(new Intent(sign_up.this, home.class));}

        }


    }


