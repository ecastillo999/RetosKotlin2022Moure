import sharp from "sharp"

function gcd (a, b){
    return b
      ? gcd(b, a % b)
      : a;
};
  
function calcularAspectRatio (width, height){
    const divisor = gcd(width, height);
    return `${width / divisor}:${height / divisor}`;
};

async function aspectRatio(url){
    const imagen = await fetch(url)
    const imagenData = await imagen.arrayBuffer()
    const {width, height} = await sharp(imagenData).metadata()
    
      
    
    console.log(calcularAspectRatio(width, height))
    return calcularAspectRatio(width, height)
}

aspectRatio("https://avatars.githubusercontent.com/u/17043402?v=4df")