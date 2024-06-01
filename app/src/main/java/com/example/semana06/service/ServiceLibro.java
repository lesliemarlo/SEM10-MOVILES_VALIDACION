package com.example.semana06.service;

import com.example.semana06.entity.Libro;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiceLibro {

    @POST("servicio/libro")
    public Call<Libro> registra(@Body Libro objLibro);

    //SEM10 - VALIDACION DE REPETICION
    @GET("servicio/libro/porTituloIgual/{titulo}")
    public  Call<List<Libro>> listaLibroPorTituloIgual(@Path("titulo") String libro);

}
