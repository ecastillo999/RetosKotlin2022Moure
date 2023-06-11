//package com.mouredev.weeklychallenge2022

//* Reto #3
//* �ES UN N�MERO PRIMO?
//* Fecha publicaci�n enunciado: 17/01/22
//* Fecha publicaci�n resoluci�n: 24/01/22
//* Dificultad: MEDIA

//* Enunciado: Escribe un programa que se encargue de comprobar si un n�mero es o no primo.
//* Hecho esto, imprime los n�meros primos entre 1 y 100.

//* Informaci�n adicional:
//* - Usa el canal de nuestro discord (https://mouredev.com/discord) "??reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
//* - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu soluci�n aportada.
//* - Revisar� el ejercicio en directo desde Twitch el lunes siguiente al de su publicaci�n.
//* - Subir� una posible soluci�n al ejercicio el lunes siguiente al de su publicaci�n.

SubProceso calcular_serie(num)
	Para num<-1 Hasta 100 Con Paso 1 Hacer
		calcular_nprimos(num)
	Fin Para
FinSubProceso

SubProceso calcular_nprimos(num Por Referencia)
	contador = 0
	
	Para i<-1 Hasta num Hacer
		Si num mod i = 0 Entonces
			contador = contador + 1
		FinSi
	Fin Para
	
	Si contador = 2 Entonces
		Mostrar num ", es un n�mero primo."
	FinSi
	
FinSubProceso

Algoritmo nPrimos
	Definir num, i, contador Como Entero
	
	calcular_serie(num)
FinAlgoritmo
