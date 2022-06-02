package com.elizabeth.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.elizabeth.demo.modelo.Venta;

public interface IventaService {
	public List<Venta>listar();
	public Optional<Venta>listarId(int id, int cantidad);
	public int save(Venta v);
}
