select v.nombre, SUM(v.cantidad) AS TotalVentas from venta v group by v.nombre 
order by SUM(v.cantidad) DESC;
