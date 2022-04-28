/*1. Mostrar el nombre de las provincias.*/
SELECT nombre 
FROM provincia;

/*2. Mostrar el nombre y apellidos de los alumnos.*/
SELECT nombre, apellidos
from alumno;

/*3. Mostrar el código y el nombre de todas las asignaturas.*/
select id_asig, nombre
from asignatura;
-- En este caso, como los únicos atributos de asignatura son ID_ASIG y NOMBRE, 
-- también podríamos haber puesto SELECT * FROM ASIGNATURA;


/*4. Mostrar el DNI, nombre y apellidos de los profesores, ordenados por DNI ascendentemente.*/
select dni, nombre, apellidos
from profesor
order by dni asc;

--alternativa
select dni, nombre, apellidos
from profesor
order by 1 asc;

--asc se puede omitir ya que por defecto ordena asc

/*5. Mostrar los datos de los alumnos de mayor a menor edad, 
y fecha de nacimiento aparezca como “Fecha_de_nacimiento”.*/
select id_alum, dni, nombre, apellidos, fecha_nac as Fecha_de_nacimiento, nacido_en
from alumno
order by fecha_nac;

--alternativa
select id_alum, dni, nombre, apellidos, fecha_nac as Fecha_de_nacimiento, nacido_en
from alumno
order by Fecha_de_nacimiento;

--alternativa
select id_alum, dni, nombre, apellidos, fecha_nac as Fecha_de_nacimiento, nacido_en
from alumno
order by 5;

/*6. Mostrar los datos del alumno cuyo DNI es 56846315M */
select *
from alumno
where dni = '56846315M';

--alternativa
select *
from alumno
where dni like '56846315M';

--alternativa 2
select *
from alumno
where upper(dni) like upper('56846315M');

/*7 Mostrar los alumnos nacidos en las provincias cuyos códigos estén entre 3 y 7.*/
select *
from alumno
where nacido_en between 3 and 7;

--alternativa
select *
from alumno
where nacido_en >=3 
and nacido_en <=7;

/*8. Mostrar los profesores nacidos en alguna de estas provincias: 1, 3, 5, 7.*/
select *
from profesor
where nacido_en in (1,3,5,7);

/*9. Mostrar los alumnos nacidos entre el 19/02/1980 y el 20/07/1984.*/
select *
from alumno
where fecha_nac>='1980-02-19'
and fecha_nac<='1984-07-20';

--alternativa
select *
from alumno
where fecha_nac between '1980-02-19' and '1984-07-20';

/*10. Mostrar los registros de la tabla “Matriculado” del alumno 7.*/
select * 
from matriculado 
where id_alum = 7;

/* 11. Mostrar el nombre y apellidos de los alumnos mayores de 24 años.*/
SELECT NOMBRE, APELLIDOS
FROM alumno
WHERE datediFF(CURDATE(),Fecha_Nac)>30*365;

SELECT NOMBRE, APELLIDOS
FROM alumno
WHERE TIMESTAMPDIFF(YEAR,Fecha_Nac,CURDATE())>30;

-- alternativa (no es exacta)
SELECT NOMBRE, APELLIDOS from alumno where YEAR(curdate())-YEAR(fecha_nac)>30;

-- prueba
SELECT NOMBRE, APELLIDOS, TIMESTAMPDIFF(YEAR,Fecha_Nac,CURDATE()) as edad
FROM alumno
WHERE TIMESTAMPDIFF(YEAR,Fecha_Nac,CURDATE())>30;

/* 12. Mostrar aquellos alumnos cuyo DNI contenga la letra ‘Y’.*/
SELECT * FROM ALUMNO WHERE DNI LIKE '%Y';

/* 13. Mostrar aquellos alumnos cuyo nombre empiece por ‘S’.*/
SELECT * FROM ALUMNO WHERE NOMBRE LIKE 'S%';

/* 14. Mostrar el nombre de aquellos alumnos cuyo nombre contenga la letra ‘n’, ya sea mayúscula o minúscula. */
SELECT NOMBRE FROM ALUMNO WHERE NOMBRE LIKE '%n%' or '%N%';
-- Like distingue entre mayúscula o minúscula

/* 15. Mostrar el nombre de aquellos alumnos cuyo apellido contenga la letra ‘z’, mayúscula o minúscula.*/
SELECT NOMBRE FROM ALUMNO WHERE APELLIDOS LIKE '%Z%' or '%z%';

/* 16. Mostrar aquellos alumnos que tengan por primer nombre “Manuel”.*/
SELECT * FROM ALUMNO WHERE NOMBRE LIKE 'Manuel%';

/* 17. Mostrar aquellos alumnos que se llamen “Manuel” o “Cristina”.*/
SELECT * FROM ALUMNO WHERE NOMBRE LIKE 'Manuel' OR NOMBRE LIKE 'Cristina';
-- Alternativa
SELECT * FROM ALUMNO WHERE NOMBRE IN ('Manuel','Cristina');

/* 18. Mostrar los datos de los alumnos cuyo DNI empiece por 2.*/
SELECT * FROM ALUMNO WHERE DNI LIKE '2%';

/* 19. Mostrar los identificadores de provincia en las que han nacido los alumnos, sin que estos identificadores se repitan. */
SELECT DISTINCT NACIDO_EN FROM ALUMNO;
