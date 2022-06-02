package com.elizabeth.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.elizabeth.demo.modelo.Venta;

@Repository
@Transactional
public interface IVenta extends CrudRepository<Venta, Integer>{
	
	/*@Query("update producto p set p.cantidad = :cantidad where p.nombre = :nombre")
	public int setCantByName(@Param("age") int cant, @Param("name") String nombre);
	
	@Query("select cantidad from productos where nombre = :=name")
	int getCantidad(@Param("cantidad") int cantidad, @Param("name") String name);*/
}