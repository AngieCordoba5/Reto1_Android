package com.example.Reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

/*
* Clase del item Sucuarsales
*
* */
public class MainActivity4 extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Resources res = getResources();

        //Imagen 1 Tienda
        Drawable drawable1 = res.getDrawable(R.drawable.tienda, getTheme());
        ImageView imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //Imagen 2 Redes
        Drawable drawable2 = res.getDrawable(R.drawable.redes, getTheme());
        ImageView imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

        //Imagen 3 Pagina Web
        Drawable drawable3 = res.getDrawable(R.drawable.web, getTheme());
        ImageView imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    /****************************************************/

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.opcion1){
            Toast.makeText(this, "Escogió la ventana Productos", Toast.LENGTH_SHORT).show();
            Intent primeraPantalla = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(primeraPantalla);
        }
        if(id == R.id.opcion2){
            Toast.makeText(this, "Escogió la ventana Servicios", Toast.LENGTH_SHORT).show();
            Intent segundaPantalla = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(segundaPantalla);
        }
        if(id == R.id.opcion3){
            Toast.makeText(this, "Escogió la ventana Sucursales", Toast.LENGTH_SHORT).show();
            Intent terceraPantalla = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(terceraPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}