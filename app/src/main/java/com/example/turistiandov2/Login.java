package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreUsuario);
        cajaContrasena=findViewById(R.id.passwordUsuario);
        botonIngreso=findViewById(R.id.botonIngresar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Capturando datos de las cajas(Edittext)
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String passwordUsuario=cajaContrasena.getText().toString();

               //Abrimos una nueva ACTIVIDAD (HOME)
                Intent intent=new Intent(Login.this,Home.class);

                //Pasando datos a la nueva ACTIVIDAD
                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",passwordUsuario);

                startActivity(intent);

            }
        });




    }
}