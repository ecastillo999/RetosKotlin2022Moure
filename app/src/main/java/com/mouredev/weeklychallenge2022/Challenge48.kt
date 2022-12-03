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

from datetime import datetime, timedelta
from dateutil.relativedelta import relativedelta, MO

def fecha_adviento(date):

    caladeviento = {

        datetime(2022, 12, 1, 00, 00, 00) : "El Programador pragmatico",
        datetime(2022, 12, 2, 00, 00, 00) : "Coaching personalizado Junior",
        datetime(2022, 12, 3, 00, 00, 00) : "Libro 'Habitos Atomicos'",
        datetime(2022, 12, 4, 00, 00, 00) : "membresia MoureDev por 1 años",
        datetime(2022, 12, 5, 00, 00, 00) : "Libro 'Curso intensivo de Python' ",
        datetime(2022, 12, 6, 00, 00, 00) : "Tarjeta de Video",
       datetime(2022, 12, 7, 00, 00, 00) : "gift-card de amazon",
        datetime(2022, 12, 8, 00, 00, 00) : "Curso personalizado Django",
        datetime(2022, 12, 9, 00, 00, 00) : "Curso personalizado JavaScript",
        datetime(2022, 12, 10, 00, 00, 00) : "Cena con MoureDev",
       datetime(2022, 12, 11, 00, 00, 00) : "Libro de programación a elección",
        datetime(2022, 12, 12, 00, 00, 00) : "Membresia YOUTUBE por 1 año",
        datetime(2022, 12, 13, 00, 00, 00) : "Licencia Python",
        datetime(2022, 12, 14, 00, 00, 00) : "Licencia JavaScript",
        datetime(2022, 12, 15, 00, 00, 00) : "Libro de programacion de aplicaciones sobre IOS",
       datetime(2022, 12, 16, 00, 00, 00) : "Libro de programacion de aplicaciones sobre Android",
        datetime(2022, 12, 17, 00, 00, 00) : "CryptoMonedas",
        datetime(2022, 12, 18, 00, 00, 00) : "Coaching personalizado proyecto personal",
        datetime(2022, 12, 19, 00, 00, 00) : "2 libros : programacion + autoformacion",
        datetime(2022, 12, 20, 00, 00, 00) : "2da membresia MoureDev por 1 años",
        datetime(2022, 12, 21, 00, 00, 00) : "2do Libro 'curso intensivo de Python'",
        datetime(2022, 12, 22, 00, 00, 00) : "2do Libro 'Habitos Atomicos'",
        datetime(2022, 12, 23, 00, 00, 00) : "2da Cena con MoureDev",
        datetime(2022, 12, 24, 00, 00, 00) : "2da Licencia Python"

    }
   
    