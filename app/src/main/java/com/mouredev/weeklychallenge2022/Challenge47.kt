package com.mouredev.weeklychallenge2022

/*
 * Reto #47
 * VOCAL MÁS COMÚN
 * Fecha publicación enunciado: 21/11/22
 * Fecha publicación resolución: 28/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un función que reciba un texto y retorne la vocal que más veces se repita.
 * Si no hay vocales podrá devolver vacío.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */ def encuentra_vocal (frase):

    frase = frase1.lower()

    vocales = 'aeiouáéíóú'

    vocal_add = [0,0,0,0,0,0,0,0,0,0]

    for letrafrase in frase :

     
        for letravocales in vocales:

            if letrafrase == letravocales :

                indexvocal_add = vocales.index(letravocales)

                vocal_add[indexvocal_add] +=1


    index1eravocal = vocal_add.index(max(vocal_add))

    if vocal_add[index1eravocal] == 0 :

        print('No hay vocales en esta frase')

    else :


        print('La vocal que más se repite es la:',vocales[index1eravocal])



    vocal_add[index1eravocal] *= 0 #ELIMINO 1ERA VOCAL MAS REPETIDA PARA ENCONTRAR LA SEGUNDA 



    index2da_vocal = vocal_add.index(max(vocal_add))

    if vocal_add[index2da_vocal] == 0:

        print('No hay más vocales en esta frase')


    else:


        print('La segunda vocal que más se repite es la:',vocales[index2da_vocal])



        #LLAMO A LA FUNCION 'encuentra_vocal


frase1 = 'Encontrar y contabilizar las vocales presentes en esta frase, incluyendo vocales acentuadas : á é í ó ú'
encuentra_vocal(frase1)
