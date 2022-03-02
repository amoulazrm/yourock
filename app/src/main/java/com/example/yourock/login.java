package com.example.yourock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class login extends AppCompatActivity {
    ImageView im3;
    EditText user;
    EditText pass;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        im3 = (ImageView) findViewById(R.id.im3);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(v -> checkDataEntered());

    }
    boolean isEmpty (EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered () {
        if (isEmpty(user)) {
            user.setError("Enter valid user!");
        }

        else if (isEmpty(pass)) {
            pass.setError("Enter valid password");
            }
        else { startActivity(new Intent(login.this, home.class));}
    }
}
