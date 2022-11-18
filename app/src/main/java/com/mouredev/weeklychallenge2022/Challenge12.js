/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

function isPalindrome(str){
	const myRegex = /[^a-z0-9]/g; // to find every char that is not alphanumeric
	str = str.toLowerCase().replace(myRegex,""); // lowercases the string and replaces every non alphanumeric char by ""
	// with this we can convert the string to an array, invert it and convert it back to string
	if(str === str.split("").reverse().join("")) return true; // if the string is equal to the string reversed -> return true
	return false; // else -> return false
}

console.log(isPalindrome("Live on time, emit no evil")); // true
console.log(isPalindrome("What do you think about this challenge?")); // false