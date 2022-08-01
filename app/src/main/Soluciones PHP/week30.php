/*
* Reto #30
* MARCO DE PALABRAS
* Fecha publicación enunciado: 26/07/22
* Fecha publicación resolución: 01/08/22
* Dificultad: FÁCIL
*
* Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
* un marco rectangular de asteriscos.
* - ¿Qué te parece el reto? Se vería así:
*   **********
*   * ¿Qué   *
*   * te     *
*   * parece *
*   * el     *
*   * reto?  *
*   **********
*
* Información adicional:
* - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
* - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
* - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
* - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
*
*/

<?php



encuadrar('¿Qué te parece el reto?');
encuadrar('¿Qué te parece el reto?                             ');
encuadrar('¿Qué te                                  parece el reto?');


function encuadrar($frase){

    $maxLongitud = 0;
    $arrayPalabras = array_filter(explode(' ',trim($frase)), function($a) {return $a != '';});

    foreach ($arrayPalabras as $palabra){
        $longitudPalabra = mb_strlen($palabra);
        if($longitudPalabra > $maxLongitud){
            $maxLongitud = $longitudPalabra;
        }
    }

    for($i = 0; $i< $maxLongitud+4;$i++){
        echo "*";
    }
    echo "\r\n";
    foreach ($arrayPalabras as $palabra){
        echo "* ".$palabra;
        for ($j = 0;$j<$maxLongitud - mb_strlen($palabra);$j++){
            echo " ";
        }
        echo " *\r\n";
    }
    for($i = 0; $i< $maxLongitud+4;$i++){
        echo "*";
    }
    echo "\r\n-----------------------\r\n";
}



