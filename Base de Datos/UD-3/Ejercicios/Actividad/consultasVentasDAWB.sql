/*3. Obtener los códigos de las piezas suministradas 
por el proveedor s2, ordenados.*/
select distinct codpie
from ventas
where codpro like upper('s2');
--No especifica el orden, con lo que las dos opciones son válidas
select distinct codpie
from ventas
where codpro like upper('s2')
order by codpie desc;
/*5. Obtener todas las ocurrencias pieza.color, pieza.ciudad 
eliminando los pares duplicados.*/
select distinct color, ciudad
from pieza;
/*6. Obtener los códigos de las ventas en los que la cantidad no sea nula.
*/
select codpro, codpie, codpj
from ventas
where cantidad is not null;

--Alternativa
select concat(codpro,'-', codpie, '-', codpj) as CodigoVentas
from ventas
where cantidad is not null;

/*7. Obtener códigos de los proyectos y ciudades en las que la ciudad 
del proyecto tenga una
'o' en la segunda letra.
*/
select codpj, ciudad
from proyecto
where ciudad like '_o%';

/*8. Obtener un listado ascendente de los nombres de las piezas 
con más de 5 letras.
*/
select nompie
from pieza 
where char_length(nompie)>5
order by nompie;

--Alternativa

select nompie
from pieza 
where nompie like '______%'
order by nompie;

/*9. Obtener nombres abreviados de proyectos tomando sus primeras 3 
letras.
*/
select left(nompj,3)
from proyecto;
/*10. Obtener los tres últimos caracteres de los nombres de 
proveedores por orden alfabético.*/
select right(nompro,3)
from proveedor
order by 1;
/*11. Hallar cuántas piezas distintas existen.
*/
select count(*)
from pieza;

/*12. Hallar cuántas piezas distintas existen 
dando nombre a la columna resultante Número.*/
select count(*) as Numero
from pieza;
/*13. Obtener el número total de proyectos suministrados 
por el proveedor sl.*/
select count(*) 
from ventas
where codpro like 's1';

/*15. Obtener la cantidad media de piezas suministradas, 
cantidad máxima y mínima
suministrada.
*/

select avg(cantidad), max(cantidad), min(cantidad)
from ventas;

/*16. Obtener las ventas en las que la cantidad de piezas esté 
entre 300 y 750 inclusive.
*/
select *
FROM ventas
where cantidad BETWEEN 300 and 750;

/*17. Construir una consulta que devuelva codpie si en la tabla piezas el
color de la pieza no es ni rojo ni gris.
*/
select codpie
from pieza
where color not like 'Rojo'
and color not like 'Gris';

/*22. Construir una lista ordenada de todas las ciudades 
en las que al menos resida un
proveedor o suministrador, una pieza o un proyecto.*/

select ciudad from pieza
union 
select ciudad from proyecto
union
select ciudad from proveedor
order by ciudad;

/*23. Obtener todas las posibles combinaciones entre piezas 
y proveedores.
*/
select distinct codpie, codpro
from pieza, proveedor;

select codpie, codpro
from pieza, proveedor;

select *
from pieza, proveedor;

/*24. Obtener todos los posibles tríos de código de proveedor, 
código de pieza y código de
proyecto en los que el proveedor, pieza y proyecto estén en 
la misma ciudad.
*/
select codpie, codpro, codpj
from pieza p, proveedor s, proyecto j
where p.ciudad = s.ciudad
and s.ciudad = j.ciudad;

/*25. Obtener los códigos de proveedor, de pieza y de proyecto de aquellos cargamentos en
los que proveedor, pieza y proyecto estén en la misma ciudad.
*/
select p.codpie, s.codpro, j.codpj
from pieza p, proveedor s, proyecto j, ventas v
where p.codpie = v.codpie
and s.codpro = v.codpro
and j.codpj = v.codpj
and p.ciudad = s.ciudad
and s.ciudad = j.ciudad;

/*26. Obtener todos los posibles tríos de código de proveedor, 
código de pieza y código de
proyecto en los que el proveedor, pieza y proyecto no estén todos 
en la misma ciudad.
*/
select codpie, codpro, codpj
from pieza p, proveedor s, proyecto j
where p.ciudad != s.ciudad
or s.ciudad != j.ciudad
or p.ciudad != j.ciudad;


/*27. Obtener todos los posibles tríos de código de proveedor, 
código de pieza y código de
proyecto en los que el proveedor, pieza y proyecto 
no estén ninguno en la misma
ciudad.
*/

select codpie, codpro, codpj
from pieza p, proveedor s, proyecto j
where p.ciudad != s.ciudad
and s.ciudad != j.ciudad
and p.ciudad != j.ciudad;

/*28. Obtener los códigos de las piezas suministradas por 
proveedores de Londres*/
select codpie
from ventas v join proveedor s on v.codpro =s.codpro
where s.ciudad = 'Londres';
