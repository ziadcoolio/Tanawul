package com.coolio.tanawul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClicked(View view){
        EditText usernameEdit= (EditText) findViewById(R.id.username);
        String username=usernameEdit.getText().toString();
        EditText passwordEdit= (EditText) findViewById(R.id.password);
        String password=passwordEdit.getText().toString();
        if(username.equals("rider")){
            if(password.equals("1234")){
                Intent intent = new Intent(MainActivity.this, RiderActivity.class);
                startActivity(intent);
            }
            else{
                Toast toast = Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else{
            Toast toast = Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
