package com.anncode.aplicacioncontactos.restApi;

import com.anncode.aplicacioncontactos.Activities.ActivityConfigurarCuenta;

/**
 * Created by Cuauhtlehuanitl on 24/06/2016.
 */
public final class ConstantesRestApi {

    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "3448088059.a192146.8bd8103a163b42a9863b61c5be685eed";
    public static final String KEY_ACCESS_TOKEN = "?access_token=";
    public static final String KEY_GET_RECENT_MEDIA_USER1 = "users/";
    public static final String USER_ID = "self";
    public static final String KEY_GET_RECENT_MEDIA_USER2 = "/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER1 + USER_ID + KEY_GET_RECENT_MEDIA_USER2 + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/self/?access_token=3448088059.a192146.8bd8103a163b42a9863b61c5be685eed

    //gateria27
    public static final String USER_ID1 = "3435808795";
    public static final String URL_GET_RECENT_MEDIA_USER1 = KEY_GET_RECENT_MEDIA_USER1 + USER_ID1 + KEY_GET_RECENT_MEDIA_USER2 + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/33435808795/media/recent/?access_token=3448088059.a192146.8bd8103a163b42a9863b61c5be685eed

    //micrcele
    public static final String USER_ID2 = "2163701855";
    public static final String URL_GET_RECENT_MEDIA_USER2 = KEY_GET_RECENT_MEDIA_USER1 + USER_ID2 + KEY_GET_RECENT_MEDIA_USER2 + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/2163701855/media/recent/?access_token=3448088059.a192146.8bd8103a163b42a9863b61c5be685eed

    //elmasbananaro
    public static final String USER_ID3 = "3444265308";
    public static final String URL_GET_RECENT_MEDIA_USER3 = KEY_GET_RECENT_MEDIA_USER1 + USER_ID3 + KEY_GET_RECENT_MEDIA_USER2 + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/3444265308/media/recent/?access_token=3448088059.a192146.8bd8103a163b42a9863b61c5be685eed

    //goliath
    public static final String USER_ID4 = "3437462127";
    public static final String URL_GET_RECENT_MEDIA_USER4 = KEY_GET_RECENT_MEDIA_USER1 + USER_ID4 + KEY_GET_RECENT_MEDIA_USER2 + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/3437462127/media/recent/?access_token=3448088059.a192146.8bd8103a163b42a9863b61c5be685eed

}
