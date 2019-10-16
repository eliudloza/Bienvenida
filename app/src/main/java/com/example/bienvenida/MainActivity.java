package com.example.bienvenida;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bb = getIntent().getExtras();
        persona p=(persona) bb.getSerializable("persona");
        Toast.makeText(this, p.getNombre() + " " + p.getEdad(),Toast.LENGTH_SHORT).show();


        //Crear temporizador
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },4000);*/

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Btnnavegador:
                Intent t1 = new Intent(Intent.ACTION_VIEW);
                t1.setData(Uri.parse("http://www.google.com"));
                startActivity(t1);
                break;

            case R.id.Btnllamar:
                Intent t = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8721397524"));
                if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_DENIED){
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(t);
                break;


        }
    }
}
