package com.anncode.aplicacioncontactos.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.anncode.aplicacioncontactos.restApi.ConstantesRestApi;
import com.anncode.recyclerviewfragments.R;

public class ActivityConfigurarCuenta extends AppCompatActivity {

    public static String usuarioActual = "self";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_configurar_cuenta);
    }

    public void guardarCuenta(View v){
        Toast.makeText(this, "User: " + usuarioActual, Toast.LENGTH_LONG).show();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

    }

    public void usuario01(View v) {
        usuarioActual = "gateria27";
        Toast.makeText(this, usuarioActual, Toast.LENGTH_SHORT).show();
    }

    public void usuario02(View v) {
        usuarioActual = "micrcele";
        Toast.makeText(this, usuarioActual, Toast.LENGTH_SHORT).show();
    }

    public void usuario03(View v) {
        usuarioActual = "elmasbananaro";
        Toast.makeText(this, usuarioActual, Toast.LENGTH_SHORT).show();
    }

    public void usuario04(View v) {
        usuarioActual = "goliath";
        Toast.makeText(this, usuarioActual, Toast.LENGTH_SHORT).show();
    }


}
