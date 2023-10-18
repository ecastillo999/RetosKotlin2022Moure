 /*package com.mouredev.weeklychallenge2022


#  * Reto #35
#  * BATALLA POK�MON
#  * Fecha publicaci�n enunciado: 29/08/22
#  * Fecha publicaci�n resoluci�n: 06/09/22
#  * Dificultad: MEDIA
#  *
#  * Enunciado: Crea un programa que calcule el da�o de un ataque durante una batalla Pok�mon.
#  * - La f�rmula ser� la siguiente: da�o = 50 * (ataque / defensa) * efectividad
#  * - Efectividad: x2 (s�per efectivo), x1 (neutral), x0.5 (no es muy efectivo)
#  * - S�lo hay 4 tipos de Pok�mon: Agua, Fuego, Planta y El�ctrico (buscar su efectividad)
#  * - El programa recibe los siguientes par�metros:
#  *  - Tipo del Pok�mon atacante.
#  *  - Tipo del Pok�mon defensor.
#  *  - Ataque: Entre 1 y 100.
#  *  - Defensa: Entre 1 y 100.
#  *
#  * Informaci�n adicional:
#  * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "??reto-semanal"
#  *   para preguntas, dudas o prestar ayuda a la comunidad.
#  * - Tienes toda la informaci�n sobre los retos semanales en
#  *   https://retosdeprogramacion.com/semanales2022.
#  *
#  */

#include <iostream>
using namespace std;


float atac(string atacante,string defensor){

	float efectividad;
//fuego	
	if((atacante=="fuego" && defensor=="agua")||(atacante==defensor)){
		
		efectividad=0.5;
	}
	if(atacante=="fuego" && defensor=="planta"){
		efectividad=2;
	}
	if(atacante=="fuego" && defensor=="electrico"){
		efectividad=1;
	}
	
//agua
	if((atacante=="agua"&&defensor=="planta")||(atacante==defensor)){
		efectividad=0.5;
	}
	if(atacante=="agua" && defensor=="fuego"){
		efectividad=2;
	}
	if(atacante=="agua" && defensor=="electrico"){
		efectividad=1;
	}	
//electrico
	if((atacante=="electrico"&&defensor=="planta")||(atacante==defensor)){
		efectividad=0.5;
	}
	if(atacante=="electrico" && defensor=="agua"){
		efectividad=2;
	}
	if(atacante=="electrico" && defensor=="fuego"){
		efectividad=1;
	}	
//planta
	if((atacante=="planta"&&defensor=="fuego")||(atacante==defensor)){
		efectividad=0.5;
	}
	if(atacante=="planta" && defensor=="agua"){
		efectividad=2;
	}
	if(atacante=="planta" && defensor=="electrico"){
		efectividad=1;
	}
	return efectividad;
}


int main(int argc, char** argv) {
	
	string atacante="";
	string defensor="";
	float ataque;
	float defensa;
	int tipo1;
	int tipo2;
	double attack;
	float efectividad;
	
	cout<<"Seleccione el tipo del pokemon atacante: "<<endl;
	cout<<"1. Fuego "<<endl;
	cout<<"2. Agua "<<endl;
	cout<<"3. Planta "<<endl;
	cout<<"4. Electrico "<<endl;	
	cin>>tipo1;
	
	switch (tipo1){
		case 1: atacante="fuego";
		break;
		case 2: atacante="agua";
		break;
		case 3: atacante="planta";
		break;
		case 4: atacante="electrico";
		break;
		default:
			break;
	}
		
		
	system("cls");
	
	cout<<"Seleccione el tipo del pokemon defensor: "<<endl;
	cout<<"1. Fuego "<<endl;
	cout<<"2. Agua "<<endl;
	cout<<"3. Planta "<<endl;
	cout<<"4. Electrico "<<endl;	
	cin>>tipo2;
	
	switch (tipo2){
		case 1: defensor="fuego";
		break;
		case 2: defensor="agua";
		break;
		case 3: defensor="planta";
		break;
		case 4:	defensor="electrico";
		break;
		default:
			break;
	}	
	
	efectividad=atac(atacante,defensor);
	
		system("cls");

	cout<<"Seleccione la cantidad de ataque Entre 1 y 100: "<<endl;
	cin>>ataque;
	cout<<"Seleccione la cantidad de defensa Entre 1 y 100: "<<endl;
	cin>>defensa;
	
	
	
	attack = 50*(ataque/defensa)*efectividad;
	
	cout<<"Da�o de ataque: "<<attack<<endl;
	
	return 0;
}
