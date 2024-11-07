package com.miempresa.primark.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.miempresa.primark.app.entity.Articulo;

public interface IArticuloRepository extends CrudRepository<Articulo, Long> {

}