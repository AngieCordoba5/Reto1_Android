package com.example.Reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
/*
 * Autora: Angie Córdoba
 * Clase Principal
 *
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*************************Menu opciones************************************/

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    /**************************************************************************/

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Variable para usar los items del menu
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
