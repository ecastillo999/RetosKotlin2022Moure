#
# Reto #46
# ¿DÓNDE ESTÁ EL ROBOT?
# Fecha publicación enunciado: 14/10/22
# Fecha publicación resolución: 21/11/22
# Dificultad: MEDIA
#
# Enunciado: Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cudrícula
# representada por los ejes "x" e "y".
# - El robot comienza en la coordenada (0, 0).
# - Para idicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos)
#   que indican la secuencia de pasos a dar.
#  - Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene,
#    y finalmente 2. El resultado en este caso sería (x: -5, y: 12)
# - Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
# - Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte
#   positiva del eje "y".
# - El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira
#   90 grados en el sentido contrario a las agujas del reloj.
#
# Información adicional:
# - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
#   para preguntas, dudas o prestar ayuda a la comunidad.
# - Tienes toda la información sobre los retos semanales en
#   https://retosdeprogramacion.com/semanales2022.
#

def donde_esta_robot(pasos):
    y = 0
    x = 0
    sentido = 1 # 1-arriba, 2-izquierda, 3-abajo, 4-derecha
    cordenadas = []
  
    for paso in range(len(pasos)):
        if sentido == 1:
            y += pasos[paso]
        elif sentido == 2:
            x -= pasos[paso]
        elif sentido ==3:
            y -= pasos[paso]
        else:
            x += pasos[paso]

        sentido = (sentido + 1) % 5

    cordenadas.append(x)
    cordenadas.append(y)

    return cordenadas

if __name__ == '__main__':
    pasos = [10, 5, -2]
    print(f"El robot está en: {donde_esta_robot(pasos)}")
  
    pasos = [5, 10, -5, 10]
    print(f"El robot está en: {donde_esta_robot(pasos)}")

    pasos = [10, 10, 10, 10]
    print(f"El robot está en: {donde_esta_robot(pasos)}")
