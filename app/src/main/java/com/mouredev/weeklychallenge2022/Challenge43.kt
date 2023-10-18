package com.mouredev.weeklychallenge2022

/*
 * Reto #43
 * TRUCO O TRATO
 * Fecha publicación enunciado: 24/10/22
 * Fecha publicación resolución: 02/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Este es un reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco o Trato" y
 * un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
import random

personas = {"name": ["Estheban", "Diego", "Luis", "David", "Jared", "Mayra"], "edad": [0, -10, 9, 30, 11, 34], "altura": [1.2, 150, 300, 250, 9, 10]}
sustos = ["🎃", "👻", "🦇", "💀", "🕷", "🕸"]
dulces = ["🍰", "🍬", "🍭", "🍡", "🍪", "🍫", "🍩", "🧁"]

option = True

# Validacion de solo dos opciones para continuar
while option:
    trickortreat = input("Escoge Truco o Trato: ").lower()
    if trickortreat == "truco" or trickortreat == "trato":
        option = False
    else:
        print("Escribe solo una opción ya sea TRUCO o TRATO \n")

letras = 0
edades = 0
alturas = []

# Validación del total de letras en el nombre
for nombre in personas["name"]:
    for letra in nombre:
        if letra.lower() in ["a", "e", "i", "o", "u"]:
            letras += 1
        
# Validación de rangos razonables de altura y en caso de metros
for altura in personas["altura"]:
    if 9>=altura>0:
        conversion = altura * 100
        if conversion > 250:
            alturas.append(250)
        else:
            alturas.append(conversion)
    elif 250>altura>40:
        alturas.append(altura)
    elif altura >= 250:
        alturas.append(250)
    else:
        alturas.append(0)

# Imprimir los trucos
if trickortreat == "truco":
    
    for edad in personas["edad"]:
        if edad % 2 == 0:
            edades += 1
        
    total = int(letras/2) + edades + int((sum(alturas))/100) 
    for i in range(total):
        print(random.choice(sustos), end=" ")
    print(f'\nTotal: {total}')
        
# Imprimir los Dulces
if trickortreat == "trato":
    
    for edad in personas["edad"]:
        if edad >= 10:
            edades += 3
        elif edad > 0:
            edades += int(edad / 3)
        else:
            continue
        
    dulces_cuenta = 0
    
    for altura in alturas:
        if altura >= 150:
            dulces_cuenta += 3
        else:
            dulces_cuenta += int(altura / 50)
        
    total = letras + dulces_cuenta + edades
    for i in range(total):
        print(random.choice(dulces), end=" ")
    print(f'\nTotal: {total}')

fun main() {
    println(trickOrTreat(Halloween.TRICK, arrayOf(
        Person("Brais", 35, 177),
        Person("Sara", 9, 122),
        Person("Pedro", 5, 80),
        Person("Roswell", 3, 54))))

    println(trickOrTreat(Halloween.TREAT, arrayOf(
        Person("Brais", 35, 177),
        Person("Sara", 9, 122),
        Person("Pedro", 5, 80),
        Person("Roswell", 3, 54))))
}

enum class Halloween {
    TRICK, TREAT
}

data class Person(val name: String, val age: Int, val height: Int)

private fun trickOrTreat(halloween: Halloween, people: Array<Person>): String {

    val scares = arrayOf("🎃", "👻", "💀", "🕷", "🕸", "🦇")
    val candies = arrayOf("🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩")

    var result = ""
    var height = 0

    people.forEach { person ->

        when (halloween) {
            Halloween.TRICK -> {

                // Name
                (1 .. (person.name.replace(" ", "").length / 2)).forEach { _ ->
                    result += scares.random()
                }

                // Age
                if (person.age % 2 == 0) {
                    result += scares.random()
                    result += scares.random()
                }

                // Height
                height += person.height
                while (height >= 100) {
                    result += scares.random()
                    result += scares.random()
                    result += scares.random()
                    height -= 100
                }

            }
            Halloween.TREAT -> {

                // Name
                (1 .. (person.name.replace(" ", "").length)).forEach { _ ->
                    result += candies.random()
                }

                // Age
                if (person.age <= 10) {
                    (1 .. (person.age / 3)).forEach { _ ->
                        result += candies.random()
                    }
                }

                // Height
                if (person.height <= 150) {
                    (1 .. (person.height / 50)).forEach { _ ->
                        result += candies.random()
                        result += candies.random()
                    }
                }
            }
        }

    }

    return result
}
