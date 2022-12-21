package com.example.lessplastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText edtUsuario = findViewById(R.id.edtFormWeight);
        EditText edtPassword = findViewById(R.id.edtPassword);
        Button btnIngresar = findViewById(R.id.btnLogin);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();

                if (usuario.equals("usuario") && password.equals("1234")) {

                    Button btnLogin = findViewById(R.id.btnLogin);

                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                    });
                } else {
                }
            }
        });
    }
}