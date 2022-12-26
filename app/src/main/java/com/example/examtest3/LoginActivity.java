package com.example.examtest3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText uname,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname=findViewById(R.id.etUname);
        pass=findViewById(R.id.etPassword);
        login=findViewById(R.id.btnLogin);

        //create onlistener for click method
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().equals("Hazirah")&&pass.getText().toString().equals("hazirah123")){
                    //make toast for tell user login successfully
                    Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();

                    //intent to next page
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("Uname",uname.getText().toString());
                    uname.setText("");
                    pass.setText("");
                    startActivity(intent);
                }else{
                    uname.setText("");
                    pass.setText("");
                    //call for alert dialog
                    showAlertDialogClicked();

                }
            }
        });
    }

    public void showAlertDialogClicked(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("Username and Password is Wrong,Please Try Again!");

        //add button
        builder.setPositiveButton("OK",null);

        //create and show alert dialog
        AlertDialog dialog= builder.create();
        dialog.show();
    }
}