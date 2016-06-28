package com.anncode.aplicacioncontactos.presentador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.anncode.aplicacioncontactos.Activities.ActivityConfigurarCuenta;
import com.anncode.aplicacioncontactos.model.ConstructorContactos;
import com.anncode.aplicacioncontactos.model.Contacto;
import com.anncode.aplicacioncontactos.restApi.EndpointsApi;
import com.anncode.aplicacioncontactos.restApi.adapter.RestApiAdapter;
import com.anncode.aplicacioncontactos.restApi.model.ContactoResponse;
import com.anncode.aplicacioncontactos.vista.fragment.IRecyclerViewFragmentView;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by anahisalgado on 21/04/16.
 */
public class RecyclerViewFragmentPresenter implements IRecylerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorContactos constructorContactos;
    private ArrayList<Contacto> contactos;

    public  RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        //obtenerContactos();
        obtenerMediosRecientes();
    }

    @Override
    public void obtenerContactos() {
        constructorContactos = new ConstructorContactos(context);
        contactos = constructorContactos.obtenerDatos();
        mostrarContactosRV();
    }

    @Override
    public void obtenerMediosRecientes() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();
        EndpointsApi endpointsApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

        if (ActivityConfigurarCuenta.usuarioActual == "self") {
            Call<ContactoResponse> contactoResponseCall = endpointsApi.getRecentMedia();
            contactoResponseCall.enqueue(new Callback<ContactoResponse>() {
                @Override
                public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                    ContactoResponse contactoResponse = response.body();
                    contactos = contactoResponse.getContactos();
                    mostrarContactosRV();
                }

                @Override
                public void onFailure(Call<ContactoResponse> call, Throwable t) {
                    Toast.makeText(context, "Algo pasó, intenta de nuevo", Toast.LENGTH_LONG).show();
                    Log.e("Falló la conexión", t.toString());
                }
            });
        }

        if (ActivityConfigurarCuenta.usuarioActual == "gateria27") {
            Call<ContactoResponse> contactoResponseCall1 = endpointsApi.getRecentMedia1();
            contactoResponseCall1.enqueue(new Callback<ContactoResponse>() {
                @Override
                public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                    ContactoResponse contactoResponse = response.body();
                    contactos = contactoResponse.getContactos();
                    mostrarContactosRV();
                }

                @Override
                public void onFailure(Call<ContactoResponse> call, Throwable t) {
                    Toast.makeText(context, "Algo pasó, intenta de nuevo", Toast.LENGTH_LONG).show();
                    Log.e("Falló la conexión", t.toString());
                }
            });
        }

        if (ActivityConfigurarCuenta.usuarioActual == "micrcele") {
            Call<ContactoResponse> contactoResponseCall2 = endpointsApi.getRecentMedia2();
            contactoResponseCall2.enqueue(new Callback<ContactoResponse>() {
                @Override
                public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                    ContactoResponse contactoResponse = response.body();
                    contactos = contactoResponse.getContactos();
                    mostrarContactosRV();
                }

                @Override
                public void onFailure(Call<ContactoResponse> call, Throwable t) {
                    Toast.makeText(context, "Algo pasó, intenta de nuevo", Toast.LENGTH_LONG).show();
                    Log.e("Falló la conexión", t.toString());
                }
            });
        }


        if (ActivityConfigurarCuenta.usuarioActual == "elmasbananaro") {
            Call<ContactoResponse> contactoResponseCall3 = endpointsApi.getRecentMedia3();
            contactoResponseCall3.enqueue(new Callback<ContactoResponse>() {
                @Override
                public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                    ContactoResponse contactoResponse = response.body();
                    contactos = contactoResponse.getContactos();
                    mostrarContactosRV();
                }

                @Override
                public void onFailure(Call<ContactoResponse> call, Throwable t) {
                    Toast.makeText(context, "Algo pasó, intenta de nuevo", Toast.LENGTH_LONG).show();
                    Log.e("Falló la conexión", t.toString());
                }
            });
        }


        if (ActivityConfigurarCuenta.usuarioActual == "goliath") {
            Call<ContactoResponse> contactoResponseCall4 = endpointsApi.getRecentMedia4();
            contactoResponseCall4.enqueue(new Callback<ContactoResponse>() {
                @Override
                public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                    ContactoResponse contactoResponse = response.body();
                    contactos = contactoResponse.getContactos();
                    mostrarContactosRV();
                }

                @Override
                public void onFailure(Call<ContactoResponse> call, Throwable t) {
                    Toast.makeText(context, "Algo pasó, intenta de nuevo", Toast.LENGTH_LONG).show();
                    Log.e("Falló la conexión", t.toString());
                }
            });
        }





    }


    @Override
    public void mostrarContactosRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(contactos));
        iRecyclerViewFragmentView.generarGridLayout();
    }
}
