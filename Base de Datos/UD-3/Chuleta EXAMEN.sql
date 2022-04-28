mysql -u root -p


create database nombre_base_datos;
SHOW DATABASES;
ALTER DATABASE nombre_base_datos;
drop database nombre_base_datos;
use basededatos;


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


CREATE TABLE new_table_name AS
	SELECT column1, column2,...
	FROM existing_table_name
	[WHERE ...];
;


ALTER TABLE nombre_tabla [ADD | DROP | MODIFY] column ( 
	columna1 tipo [ restricciones ]
	[, columna2 tipo [ restricciones ] ... ] ); 
	

DROP TABLE nombre_tabla;


SELECT * FROM nombre_tabla;

INSERT INTO nombre_tabla
VALUES (valor_columna1,...., valor_columnan);

UPDATE nombre_tabla 
SET columna1=valor1 [, columna2=valor2] ... 
[WHERE condición];


DELETE from nombre_tabla
[WHERE ...];


ALTER TABLE nombre_tabla [ADD | DROP | MODIFY] CONSTRAINT nombre [CHECK] [PRIMARY KEY] [FOREIGN KEY];





