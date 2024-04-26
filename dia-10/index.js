/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */
const diccionarioMorse = {
  A: ".-",
  B: "-...",
  C: "-.-.",
  D: "-..",
  E: ".",
  F: "..-.",
  G: "--.",
  H: "....",
  I: "..",
  J: ".---",
  K: "-.-",
  L: ".-..",
  M: "--",
  N: "-.",
  Ñ: "--.--",
  O: "---",
  P: ".--.",
  Q: "--.-",
  R: ".-.",
  S: "...",
  T: "-",
  U: "..-",
  V: "...-",
  W: ".--",
  X: "-..-",
  Y: "-.--",
  Z: "--..",
  0: "-----",
  1: ".----",
  2: "..---",
  3: "...--",
  4: "....-",
  5: ".....",
  6: "-....",
  7: "--...",
  8: "---..",
  9: "----.",
  ".": ".-.-.-",
  ",": "--..--",
  "?": "..--..",
  '"': ".-..-.",
  "/": "-..-.",
  " ": "  ",
};

function traductor(texto) {
  let traduccion = "";
  texto = texto.toUpperCase();
  if (/[A-Z0-9]/.test(texto)) {
    const textoArray = texto.split("");
    textoArray.forEach((letra) => {
      if (letra !== " ") {
        traduccion += diccionarioMorse[letra] + " ";
      } else {
        traduccion = traduccion.trimEnd();
        traduccion += diccionarioMorse[letra];
      }
    });
  } else {
    const textoArray = texto.replaceAll("  ", " / ").split(" ");
    console.log(textoArray.join(""));
    textoArray.forEach((letra) => {});
  }
  console.log(traduccion.trimEnd());
}

traductor("hola que tal");
traductor(".... --- .-.. .-  --.- ..- .  - .- .-..");
