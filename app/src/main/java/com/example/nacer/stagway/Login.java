package com.example.nacer.stagway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.editText_login);
        Password = (EditText)findViewById(R.id.editText_pwd);
        Login = (Button)findViewById(R.id.btn_login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    public void validate (String userName, String userPassword){
        if( (userName.equals("Admin")) && (userPassword.equals("1234"))
                || (userName.equals("test")) && (userPassword.equals("test"))) {
            Intent intent = new Intent(getApplicationContext(), destination.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Accès refusé", Toast.LENGTH_SHORT).show();
        }
    }
}
