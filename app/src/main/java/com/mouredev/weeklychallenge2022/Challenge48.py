"""
package com.mouredev.weeklychallenge2022

/*
 * Reto #48
 * EL CALENDARIO DE ADEVIENTO 2022
 * Fecha publicación enunciado: 28/11/22
 * Fecha publicación resolución: 05/12/22
 * Dificultad: FÁCIL
 *
 * ¿Conoces el calendario de adviento de la comunidad (https://adviento.dev)?
 * 24 días, 24 regalos sorpresa relacionados con desarrollo de software, ciencia y tecnología desde el 1 de diciembre.
 *
 * Enunciado: Crea una función que reciba un objeto de tipo "Date" y retorne lo siguiente:
 * - Si la fecha coincide con el calendario de aDEViento 2022: Retornará el regalo de ese día (a tu elección) y cuánto queda para que finalice el sorteo de ese día.
 * - Si la fecha es anterior: Cuánto queda para que comience el calendario.
 * - Si la fecha es posterior: Cuánto tiempo ha pasado desde que ha finalizado.
 *
 * Notas:
 * - Tenemos en cuenta que cada día del calendario comienza a medianoche 00:00:00 y finaliza a las 23:59:59.
 * - Debemos trabajar con fechas que tengan año, mes, día, horas, minutos y segundos.
 * - 🎁 Cada persona que aporte su solución entrará en un nuevo sorteo del calendario de aDEViento hasta el día de su corrección (sorteo exclusivo para quien entregue su solución).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
 """

from datetime import datetime, timedelta


def gifts_of_the_advent_calendar() -> list:
    gifts = []

    for day in range(1, 24):
        gifts.append({'date': datetime(2022, 12, day, 0, 0, 0), 'gift': f"Regalo {day}"})

    return gifts


def get_gift_of_the_advent_calendar(date: datetime) -> str:
    initial_date = datetime(2022, 12, 1, 0, 0, 0)
    if date < initial_date:
        return f"{initial_date - date} until the calendar begins."

    final_date = datetime(2022, 12, 24, 23, 59, 59)
    if date > final_date:
        return f"It has been {date - final_date} since the end of the calendar."


    gift = "No gift available, sorry."
    margin = timedelta(days=1)

    for item in gifts_of_the_advent_calendar():
        gift_day = item['date']

        if gift_day <= date < gift_day + margin:
            return f"The giveaway of the day is: '{item['gift']}' and there is {gift_day + margin - date} left in the draw."

    return gift


print(get_gift_of_the_advent_calendar(date=datetime(2022, 12, 1, 23, 59, 59)))
print(get_gift_of_the_advent_calendar(date=datetime(2022, 12, 15, 13, 3, 12)))
print(get_gift_of_the_advent_calendar(date=datetime(2022, 11, 1, 14, 34, 45)))
print(get_gift_of_the_advent_calendar(date=datetime(2023, 2, 1, 6, 45, 45)))
