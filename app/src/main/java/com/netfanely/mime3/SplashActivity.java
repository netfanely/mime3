package com.netfanely.mime3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Para que no se vea la barra de estado o de notificaciones
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Se ejecutar{a el método run de Runnable después de el
        //tiempo indicado en milisegundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarInicio();
            }
        }, 3000);

    }

    private void mostrarInicio() {
        startActivity(new Intent(this,MainActivity.class));
        finish();//Para cerrar el activity
    }
}
