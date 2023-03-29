#   Reto #36
#   LOS ANILLOS DE PODER
#   Fecha publicación enunciado: 06/09/22
#   Fecha publicación resolución: 14/09/22
#   Dificultad: MEDIA
#
#   Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales a Sauron
#   contra otras bondadosas que no quieren que el mal reine sobre sus tierras.
#   Cada raza tiene asociado un "valor" entre 1 y 5:
#   - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3), Númenóreanos (4), Elfos (5)
#   - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2), Huargos (3), Trolls (5)
#   Crea un programa que calcule el resultado de la batalla entre los 2 tipos de ejércitos:
#   - El resultado puede ser que gane el bien, el mal, o exista un empate. Dependiendo de la
#     suma del valor del ejército y el número de integrantes.
#   - Cada ejército puede estar compuesto por un número de integrantes variable de cada raza.
#   - Tienes total libertad para modelar los datos del ejercicio.
#   Ej: 1 Peloso pierde contra 1 Orco, 2 Pelosos empatan contra 1 Orco, 3 Pelosos ganan a 1 Orco.
#
#   Información adicional:
#   - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
#     para preguntas, dudas o prestar ayuda a la comunidad.
#   - Tienes toda la información sobre los retos semanales en
#     https://retosdeprogramacion.com/semanales2022.



class Ejercito:
    def __init__(self, raza):
        self.raza = raza

    def armaEjercito(self, texto, raza, tabla):

        print(texto)
        totalEjercito = 0
        for guerreros in self.raza:
            try:
                totalEjercito = int(input(f"Cuantos {guerreros} son?\n"))
                tabla.append(totalEjercito*self.raza[guerreros])
            except:
                print("ERROR: en datos ingresados")
                exit()

    def batalla(bondadosas, malvadas):

        print("\n=== RESULTADO FINAL ===")
        print("Bondadosas: ", sum(bondadosas))
        print("Malvadas: ", sum(malvadas))

        if sum(bondadosas) == sum(malvadas):
            print("EMPATE!!!")
        elif sum(bondadosas) > sum(malvadas):
            print("GANA EL BIEN :)")
        else:
            print("GANA EL MAL :(")


razaBondadosas = {
    "Pelosos": 1,
    "Sureños buenos": 2,
    "Enanos": 3,
    "Numenoreanos": 4,
    "Elfos": 5
}

razaMalvadas = {
    "Sureños malos": 2,
    "Orcos": 2,
    "Goblins": 2,
    "Huargos": 3,
    "Trolls": 5
}

bondadosas = []
malvadas = []

guerrerosBuenos = Ejercito(razaBondadosas)
guerrerosBuenos.armaEjercito("=== EJERCITO BONDADOSAS ===\n",
                             razaBondadosas, bondadosas)

guerrerosMalos = Ejercito(razaMalvadas)
guerrerosMalos.armaEjercito("=== EJERCITO MALVADAS ===\n",
                            razaMalvadas, malvadas)

Ejercito.batalla(bondadosas, malvadas)