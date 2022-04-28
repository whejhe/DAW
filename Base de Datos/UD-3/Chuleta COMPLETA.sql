-- conectar con el servidor
mysql -u root -p

-- base de datos
create database nombre_base_datos;
SHOW DATABASES;
ALTER DATABASE nombre_base_datos;
drop database nombre_base_datos;
use basededatos;

-- Tablas
CREATE TABLE nombre_tabla (
	campo1 tipo_dato [longitud] [NOT NULL] [UNIQUE] [PRIMARY KEY] 
	[CHECK condición] [DEFAULT valor],
	...
	[, CONSTRAINT nombre_restriccion check (condición)]
	[, CONSTRAINT nombre_restriccion PRIMARY KEY (campo, [campo])]
	[, CONSTRAINT nombre_restriccion FOREIGN KEY (campo, [campo]) 
	REFERENCES nombre_tabla (campo, [campo])
	     [ON UPDATE [NOT ACTION | SET DEFAULT | SET NULL | CASCADE]
	     [ON DELETE [NOT ACTION | SET DEFAULT | SET NULL | CASCADE] ]
);

-- creo una tabla a partir de otra
CREATE TABLE new_table_name AS
	SELECT column1, column2,...
	FROM existing_table_name
	[WHERE ...];
;
 /* EJEMPLO
CREATE TABLE ALUMNO_REPETIDOR AS
	SELECT COLUMN1, ...
	FROM ALUMNOS
	WHERE NOTA < 5;
*/

-- AÑADIR, BORRAR O MODIFICAR UNA COLUMNA
ALTER TABLE nombre_tabla [ADD | DROP | MODIFY] column ( 
	columna1 tipo [ restricciones ]
	[, columna2 tipo [ restricciones ] ... ] ); 
	
-- Borra tabla
DROP TABLE nombre_tabla;

-- Ver contenido de la tabla
SELECT * FROM nombre_tabla;

-- Insertar registros en la tabla
INSERT INTO nombre_tabla
VALUES (valor_columna1,...., valor_columnan);

-- Actualizar el contenido de la tabla
UPDATE nombre_tabla 
SET columna1=valor1 [, columna2=valor2] ... 
[WHERE condición];

-- Borra registros de la tabla
DELETE from nombre_tabla
[WHERE condición];

-- 
ALTER TABLE nombre_tabla [ADD | DROP | MODIFY] CONSTRAINT nombre [CHECK] [PRIMARY KEY] [FOREIGN KEY];





