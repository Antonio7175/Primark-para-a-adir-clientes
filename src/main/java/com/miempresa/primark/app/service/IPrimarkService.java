package com.miempresa.primark.app.service;

import com.miempresa.primark.app.entity.Articulo;

public interface IPrimarkService {

    Iterable<Articulo> findAll();

    Articulo findById(Long id);

    void save(Articulo articulo);

    void deleteById(Long id);
    
}