/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

import sharp from 'sharp'
import fetch from 'node-fetch';


async function traerImagen(imageUrl) {
    const response = await fetch(imageUrl);

    const buffer = await response.arrayBuffer();
    const {width, height} = await sharp(buffer).metadata();
    return {width, height}
}

function gcd (a, b){
    return b
      ? gcd(b, a % b)
      : a;
  };
  
  function calcularAspectRatio ({width, height}){
    const divisor = gcd(width, height);
    console.log(divisor)
    console.log(`Tamaño de imagen ${width, height}  
Aspect Ratio ${width / divisor}:${height / divisor}`);
  };
  

calcularAspectRatio(await traerImagen('https://avatars.githubusercontent.com/u/17043402?v=4'))




