/* ESTRUCTURA BÁSICA */
SELECT campos 	--- todos los campos que pide que muestre
FROM tabla
WHERE condicion;

/* ESTRUCTURA VARIAS TABLAS */
SELECT campos 	--- todos los campos que pide que muestre
FROM tabla1, tabla2
WHERE tabla1.campo = tabla2.campo;

SELECT campos 	--- todos los campos que pide que muestre
FROM tabla1, tabla2, tabla3
WHERE tabla1.campo = tabla2.campo
	AND tabla3.campo = tabla2.campo;

SELECT campos 	--- todos los campos que pide que muestre
FROM tabla1 JOIN tabla2 ON tabla1.campo = tabla2.campo
WHERE condicion;

SELECT campos 	--- todos los campos que pide que muestre
FROM tabla1 JOIN tabla2 ON tabla1.campo = tabla2.campo
	JOIN tabla3 ON tabla3.campo = tabla2.campo
	JOIN tabla4 ON tabla4.campo = tabla2.campo
WHERE condicion;

/* AGRUPACIONES */ 	
SELECT max(campo1)
FROM tabla
WHERE condicion
GROUP BY campo2
ORDER BY campo3;

/* SUBCONSULTAS
	En la consulta principal estan los campos que se muestran
	en la subconsulta los campos que tienen la condicion que me dan*/

/* FUNCIONES  TEXTO */
concat(cadena,cadena);

right(cadena,nºcaracteres);
EJEMPLO: right('cadena',3); --> Resultado: ena
EJEMPLO: left('cadena',3); --> Resultado: cad

-- Para comparar cadenas utilizar LIKE
_ : 1 caracter
% : 0 o muchos caracteres

/* FUNCIONES NUMEROS */
truncate(numero, decimales);
round(numero, decimales);
EJEMPLO: 
truncate(3.98765, 3); --> Resultado: 3.987
round(3.98765, 3); --> Resultado: 3.988
round(3.98765, 0); --> Resultado: 4

/* FUNCIONES AGREGADAS O DE RESUMEN */
MAX(campo);
min(campo);
avg(campo);
count(campo);
GROUP BY campo -- para agrupar por el campo

/* FUNCIONES FECHAS */
time(fecha) = '15:00';
hour(fecha) minute(fecha)
date_format(fecha, '%d-%m-%y');


