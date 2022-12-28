# 
#  Reto #1
#  ¿ES UN ANAGRAMA?
#  Fecha publicación enunciado: 03/01/22
#  Fecha publicación resolución: 10/01/22
#  Dificultad: MEDIA
#  
#  Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
#  - Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
#  - NO hace falta comprobar que ambas palabras existan.
#  - Dos palabras exactamente iguales no son anagrama.
#  
#  Información adicional:
#  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
#  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
#  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
#  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
# 
def anagramaConsult(firstWord:str, secondWord:str):
  itsAnagrama = True

  if firstWord == secondWord or len(firstWord) != len(secondWord):
    itsAnagrama = False
  else:
    for letter in firstWord:
      if secondWord.count(letter) == 0:
        itsAnagrama = False

  return itsAnagrama

print("Hello! Here is The Challenge #1: ¿It is an Anagrama?\n")

# Solicita las palabras a comprobar
primeraPalabra = input("Enter an inicial word: ").lower()
segundaPalabra = input("Enter another word: ").lower()

# Resultado
result = anagramaConsult(firstWord=primeraPalabra, secondWord= segundaPalabra)
print(f"\n¿It is an Anagrama?: {result}")