package com.miempresa.primark.app.service;

import com.miempresa.primark.app.entity.Articulo;
import com.miempresa.primark.app.repository.IArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimarkService implements IPrimarkService {

    @Autowired
    private IArticuloRepository articuloRepository;

    @Override
    public Iterable<Articulo> findAll() {
        return articuloRepository.findAll();
    }

    @Override
    public Articulo findById(Long id) {
        return articuloRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Articulo articulo) {
        articuloRepository.save(articulo);
    }

    @Override
    public void deleteById(Long id) {
        articuloRepository.deleteById(id);
    }

}
