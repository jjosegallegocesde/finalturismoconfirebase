package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;

import org.w3c.dom.Text;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView descripcionHotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.fotohoteldescripcion);
        nombreAmpliandoHotel=findViewById(R.id.nombrehoteldescripcion);
        descripcionHotel=findViewById(R.id.descripcionhotel);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //cargando la info en los componentes graficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        descripcionHotel.setText(moldeHotel.getDescripcion());


    }
}