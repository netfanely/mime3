package com.netfanely.mime3.iniciarsesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.netfanely.mime3.EscritorioActivity;
import com.netfanely.mime3.R;

public class InicioSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_iniciar_sesion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_informacion:
                mostrarInformacion(); 
                return true;
            case R.id.nav_acerca_de:
                mostrarAcercade(); 
                return true;
            case R.id.nav_ayuda:
                mostrarAyuda();
                return true;    
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void mostrarInformacion() {
        startActivity(new Intent(this,InformacionActivity.class));
    }

    private void mostrarAcercade() {
        startActivity(new Intent(this,AcercadeActivity.class));
    }

    private void mostrarAyuda() {
        startActivity(new Intent(this,AyudaActivity.class));
    }

    public void iniciarSesion(View view) {
        startActivity(new Intent(this, EscritorioActivity.class));
    }
}
