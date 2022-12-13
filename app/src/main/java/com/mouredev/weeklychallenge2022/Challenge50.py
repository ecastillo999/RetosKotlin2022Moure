"""
package com.mouredev.weeklychallenge2022

/*
 * Reto #50
 * LA ENCRIPTACIÓN DE KARACA
 * Fecha publicación enunciado: 12/11/22
 * Fecha publicación resolución: 19/12/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto utilizando el
 * algoritmo de encriptación de Karaca (debes buscar información sobre él).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
 """

def karaca(text:str) -> str:
    encrypt = {"a" : 0, "e" : 1, "i" : 2, "o" : 2, "u" : 3}
    reverse = text[::-1]
    for letter in reverse:
        if letter in encrypt.keys():
            reverse = reverse.replace(letter,str(encrypt[letter]))
    return reverse + 'aca'

if __name__ == "__main__":
    text = input("escribe la palabra: ").lower()
    print(karaca(text))
