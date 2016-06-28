package com.anncode.aplicacioncontactos.restApi;

import com.anncode.aplicacioncontactos.restApi.model.ContactoResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Cuauhtlehuanitl on 24/06/2016.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia();

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER1)
    Call<ContactoResponse> getRecentMedia1();

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER2)
    Call<ContactoResponse> getRecentMedia2();

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER3)
    Call<ContactoResponse> getRecentMedia3();

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER4)
    Call<ContactoResponse> getRecentMedia4();

}
