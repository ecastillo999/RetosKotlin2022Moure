""" package com.mouredev.weeklychallenge2022

/*
 * Reto #35
 * BATALLA POKÉMON
 * Fecha publicación enunciado: 29/08/22
 * Fecha publicación resolución: 06/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

fun main() {
    println(battle(PokemonType.WATER, PokemonType.FIRE, 50, 30))
    println(battle(PokemonType.WATER, PokemonType.FIRE, 101, -10))
    println(battle(PokemonType.FIRE, PokemonType.WATER, 50, 30))
    println(battle(PokemonType.FIRE, PokemonType.FIRE, 50, 30))
    println(battle(PokemonType.GRASS, PokemonType.ELECTRIC, 30, 50))
}

enum class PokemonType(name: String) {
    WATER("Agua"),
    FIRE("Fuego"),
    GRASS("Planta"),
    ELECTRIC("Eléctrico")
}

private data class PokemonChart(val effective: PokemonType, val notEffective: PokemonType)

private fun battle(attacker: PokemonType, defender: PokemonType, attack: Int, defense: Int): Double? {

    if (attack <= 0 || attack > 100 || defense <= 0 || defense > 100) {
        println("El ataque o la defensa contiene un valor incorrecto")
        return null
    }

    val typeChart = mapOf(
        PokemonType.WATER to PokemonChart(PokemonType.FIRE, PokemonType.GRASS),
        PokemonType.FIRE to PokemonChart(PokemonType.GRASS, PokemonType.WATER),
        PokemonType.GRASS to PokemonChart(PokemonType.WATER, PokemonType.FIRE),
        PokemonType.ELECTRIC to PokemonChart(PokemonType.WATER, PokemonType.GRASS)
    )

    var effectivity = 1.0
    if (attacker == defender || typeChart[attacker]!!.notEffective  == defender) {
        effectivity = 0.5
        println("No es muy efectivo")
    } else if (typeChart[attacker]!!.effective  == defender) {
        effectivity = 2.0
        println("Es súper efectivo")
    } else {
        println("Es neutro")
    }

    return 50 * attack.toDouble() / defense.toDouble() * effectivity
} """


from enum import Enum


class Effectivity(Enum):

    WATER: dict[str, float] = {"water": 0.5, "fire": 2.0, "grass": 0.5, "electric": 1.0} # type: ignore
    FIRE: dict[str, float] = {"water": 0.5, "fire": 0.5, "grass": 2.0, "electric": 1.0} # type: ignore
    GRASS: dict[str, float] = {"water": 2.0, "fire": 0.5, "grass": 0.5, "electric": 1.0} # type: ignore
    ELECTRIC: dict[str, float] = {"water": 2.0, "fire": 1.0, "grass": 0.5, "electric": 0.5} # type: ignore


def damage(pkm_attack: str, pkm_def: str, attack: int, defense: int) -> int | None:

    if attack <= 0 or defense > 100 or attack > 100 or defense <= 0:
        print("El valor de ataque y/o defensa debe estar entre 0 y 100")
        return None

    if pkm_attack.lower() not in Effectivity.WATER.value or pkm_def.lower() not in Effectivity.WATER.value:
        print("Los tipos de pokemon són: water, fire, grass o electric")
        return None

    effectivity: float = 0
    
    match pkm_attack.lower():
        case "water":
            effectivity: float = Effectivity.WATER.value[pkm_def.lower()]
        case "fire":
            effectivity: float = Effectivity.FIRE.value[pkm_def.lower()]
        case "grass":
            effectivity: float = Effectivity.GRASS.value[pkm_def.lower()]
        case "electric":
            effectivity: float = Effectivity.ELECTRIC.value[pkm_def.lower()]

    return int(50 * (attack / defense) * effectivity)




print(damage("water", "fire", 20, 20))