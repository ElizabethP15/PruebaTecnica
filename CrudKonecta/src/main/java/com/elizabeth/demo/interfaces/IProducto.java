package com.elizabeth.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elizabeth.demo.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
