from typing import List, Tuple

"""
    Reto #45
    CONTENEDOR DE AGUA
    Fecha publicación enunciado: 07/10/22
    Fecha publicación resolución: 14/11/22
    Dificultad: MEDIA
    
    Enunciado: Dado un array de números enteros positivos, donde cada uno representa unidades
    de bloques apilados, debemos calcular cuantas unidades de agua quedarán atrapadas entre ellos.
    
    - Ejemplo: Dado el array [4, 0, 3, 6, 1, 3].
    
           ⏹
           ⏹
      ⏹💧💧⏹
      ⏹💧⏹⏹💧⏹
      ⏹💧⏹⏹💧⏹
      ⏹💧⏹⏹⏹⏹
    
      Representando bloque con ⏹︎ y agua con 💧, quedarán atrapadas 7 unidades de agua.
      Suponemos que existe un suelo impermeable en la parte inferior que retiene el agua.
    
    
    Información adicional:
    - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
      para preguntas, dudas o prestar ayuda a la comunidad.
    - Tienes toda la información sobre los retos semanales en
      https://retosdeprogramacion.com/semanales2022.
"""

def count_water_lr(blocks: List[int]) -> Tuple[int, int]:
    """
    De izquierda a derecha se busca bloques apilados que pueden contener agua y estos se
    agregan al conteo teniendo en cuenta el maximo alto posible, complejidad O(n)
    """
    count, wall_index = 0, 0
    for i in range(1, len(blocks)):
        if blocks[i] >= blocks[wall_index]:
            count += sum(blocks[wall_index] - blocks[j] for j in range(wall_index, i))
            wall_index = i
    return count, wall_index

def get_total_water(blocks: List[int]) -> int:
    """
    Se calcular el agua total utilizando la funcion count_water_lr, en caso de que esta funcion
    no termine de procesar la lista, la volvemos a llamar con el resto invertido, complejidad O(n)
    """
    result, last_processed_wall = count_water_lr(blocks)
    if last_processed_wall + 2 < len(blocks):
        result += count_water_lr(blocks[:last_processed_wall - 1:-1])[0]
    return result

def test_case(blocks: List[int], expected: int):
    returned = get_total_water(blocks)
    if returned != expected:
        raise Exception(
            f"Case with blocks {blocks}, returns {returned} but it should be {expected}"
        )

def main():
    """
           #
           #
        #..#
        #.##.#
        #.##.#
        #.####
    """
    test_case([4, 0, 3, 6, 1, 3], 7)

    """
          #
          #
          #..#
        #.##.#
        #.##.#
        ####.#
    """
    test_case([3, 1, 6, 3, 0, 4], 7)

    """
        #...#
        ##..#
        ###.#
    """
    test_case([3, 2, 1, 0, 3], 6)

    """
            #...#...#
          #.#...#.#.#
          #.#.#.#.#.#
        #.#.#.#.#.#.#.#
        #.#.#.#.#.#.#.#
    """
    test_case([2, 0, 4, 0, 5, 0, 3, 0, 5, 0, 4, 0, 5, 0, 2], 31)

    """
        #.........#
        ##.......##
        ###.....###
        ####...####
        #####.#####
    """
    test_case([5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5], 25)

    """
        
              #...#
         #...###.##.#
        ###.#######.##
    """
    test_case([1, 2, 1, 0, 1, 2, 3, 2, 1, 2, 3, 0, 2, 1], 10)

    """
              #.#
          #...#.#
        #.#.#.#.#
        #########
    """
    test_case([2, 1, 3, 1, 2, 1, 4, 1, 4], 9)

    """
              #..#
         #....#..#
         ##.#.#.##
        #####.#####
    """
    test_case([1, 3, 2, 1, 2, 0, 4, 1, 2, 4, 1], 12)

    """
                    #
            #.....#.# 
        #...#..#..#.#.# 
        #.#.#.###.###.#.#.#
        #.###.###########.#
    """
    test_case([3, 0, 2, 1, 4, 0, 2, 3, 2, 1, 4, 2, 5, 1, 3, 1, 2, 0, 2], 25)

    """
          #
          ####
         ######
        #########
    """
    test_case([1, 2, 4, 3, 3, 3, 2, 1, 1], 0)

    """
              #...#
            #.#...#.#
          #.#.#...#.#.#
        #.#.#.#.#.#.#.#.#
    """
    test_case([1, 0, 2, 0, 3, 0, 4, 0, 1, 0, 4, 0, 3, 0, 2, 0, 1], 23)

    # Casos extremos, para comprobar complejidad O(n)
    test_case([i for i in range(1, 1000001)], 0)
    test_case([i % 2 for i in range(1000001)], 499999)
    test_case([1 - i % 2 for i in range(1000001)], 500000)
    test_case([i % 100000 for i in range(1000000)], 44999550000)
    test_case([99999 - i % 100000 for i in range(1000000)], 44999550000)
    test_case([1000000000 * (i % 2) for i in range(1000001)], 499999000000000)
    test_case([1000000000 * (1 - i % 2) for i in range(1000001)], 500000000000000)

    print("All cases passed!")

if __name__ == '__main__':
    main()
