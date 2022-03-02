package com.example.yourock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class fb_login extends AppCompatActivity {
    ImageView im4;
    EditText email;
    EditText mdp;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb_login);
        im4 = (ImageView) findViewById(R.id.im4);
        email = (EditText) findViewById(R.id.email);
        mdp = (EditText) findViewById(R.id.mdp);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(v -> checkDataEntered());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(email)) {
            email.setError("Enter valid email!");
        }
        else if (isEmpty(mdp)) {
            mdp.setError("Enter valid password");
        }
        else { startActivity(new Intent(fb_login.this, home.class));}
    }
}
