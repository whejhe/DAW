/* Arrancar el servicio MySQL*/
-- mysql -u root -p
-- Introducir contraseña

/* CREACIÓN DE BASE DE DATOS */
create database prueba;
use prueba;

/* CREACIÓN DE TABLAS*/
create table alumnos (
  dni char(9) primary key,
  nombre varchar(15),
  f_nacimiento date
);

create table modulos(
  codigo int primary key,
  nombre varchar(15)
);

create table recibe(
  dni_alu char(9),
  cod_mod int,
  nota decimal(4,2),
  constraint recibe_pk primary key (dni_alu,cod_mod),
  constraint recibe_alumno_fk FOREIGN KEY (dni_alu) 
                              REFERENCES alumnos (dni) ON DELETE CASCADE ON UPDATE CASCADE,
  constraint recibe_modulo_fk foreign key (cod_mod)
                              references modulos(codigo)ON DELETE CASCADE ON UPDATE CASCADE
							  
							  
);

/* INSERCION DE DATOS */
INSERT INTO alumnos 
 VALUES ( '12345678A', 'Maria', '2011-11-11');

-- comprobación
SELECT * FROM alumnos;

INSERT INTO alumnos 
 VALUES ('87654321B', 'Juan', '2012-12-12');

INSERT INTO modulos
 VALUES (1, 'base datos');

INSERT INTO modulos
 VALUES (2, 'entornos');

INSERT INTO recibe
 VALUES ('12345678A', 1, 6);

INSERT INTO recibe
 VALUES ('12345678A', 2, 4.9);

INSERT INTO recibe
 VALUES ('87654321B', 1, 5.1);

INSERT INTO recibe 
 VALUES ('87654321B', 2, 5);

-- Si quiero cambiar el nombre del modulo
UPDATE modulos
SET nombre='entorno' 
where codigo=2;

select * from recibe;

-- Voy a actualizar el dni de Juan para comprobar on cascade
UPDATE alumnos
SET dni='11111111B'  
where nombre='Juan';

-- Elimino a Juan para comprobar on cascade
DELETE from alumnos 
where nombre='Juan';

-- Crear una tabla alumnos_rep desde alumnos
CREATE TABLE alumnos_rep AS
SELECT dni, nombre, f_nacimiento
FROM alumnos
;

-- Renombrar la tabla alumnos_rep
RENAME table alumnos_rep TO alumnos_repetidores;

-- Modificar el campo nombre de alumno para que sea VARCHAR(30)
ALTER TABLE alumnos MODIFY COLUMN
nombre VARCHAR(30);

-- Prueba la modificacion 
INSERT INTO alumnos VALUES 
('34567891S','Pepe Garcia Garcia', '1996-01-10');
 
 -- Añade una comprobación que la nota sea mayor que 1.
 ALTER TABLE recibe ADD CONSTRAINT
 nota_ck CHECK (nota >= 1);
 
 -- Compruebalo
  insert into recibe values ('12345678A', 1,0.0);
 
 
 