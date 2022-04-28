/*1. Sobre alguna de las bases de datos trabajadas en unidades anteriores cree un
procedimiento para mostrar el año actual.*/
DELIMITER $$
DROP PROCEDURE IF EXISTS anioactual$$
CREATE PROCEDURE anioactual()
BEGIN
SELECT YEAR(curdate());
END
$$
CALL anioactual();
/*2. Cree y muestre una variable de usuario con SET. ¿Debe ser de sesión o puede ser
global?*/
SET @uservar=1;
SELECT @uservar
/*3. Use un procedimiento que sume uno a la variable anterior cada vez que se ejecute.*/
DELIMITER $$
DROP PROCEDURE IF EXISTS sumauno$$
CREATE PROCEDURE sumauno(INOUT a int)
BEGIN
SET a=a+1;
END
$$

call sumauno(@uservar);

/*4. Cree un procedimiento que muestre las tres primeras letras 
de una cadena pasada
como parámetro en mayúsculas.*/
DELIMITER $$
DROP PROCEDURE IF EXISTS iniciales$$

CREATE PROCEDURE iniciales(in cad varchar(100))
	BEGIN
		SET cad=left(cad, 3);
		SET cad=upper(cad);
		SELECT cad;
	END
$$

call iniciales('hola');

/*Si hubiera que mostrar las tres últimas sería SET cad=right(cad, 3);*/

/*5. Cree un procedimiento que muestre dos cadenas pasadas 
como parámetros concatenadas y en mayúsculas.*/