/*
 * Reto #21
 * CALCULADORA .TXT
 * Fecha publicación enunciado: 23/05/22
 * Fecha publicación resolución: 01/06/22
 * Dificultad: MEDIA
 *
 * Enunciado: Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su resultado e imprímelo.
 * - El .txt se corresponde con las entradas de una calculadora.
 * - Cada línea tendrá un número o una operación representada por un símbolo (alternando ambos).
 * - Soporta números enteros y decimales.
 * - Soporta las operaciones suma "+", resta "-", multiplicación "*" y división "/".
 * - El resultado se muestra al finalizar la lectura de la última línea (si el .txt es correcto).
 * - Si el formato del .txt no es correcto, se indicará que no se han podido resolver las operaciones.
 */
 
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Reto21{
    
    public static void main(String[] args){
        sum();
        //Imprime -14 en Challenge21.txt original: 5+2-1*8-15+4/2
        //Challenge21.txt modificacion 1: 4 * 3 + 5 - 6 / 4 = 15.5
        //Challenge21.txt modificacion 2: 65 * 3 / 5 + 12 = 51
        //Challenge21.txt modificacion 2: 65 * 3 / 5 + = Se encontraron caracteres invalidos o faltan numeros
    }
    
    private static void sum() {
        String path = "/storage/emulated/0/AppProjects/Only Java/Retos/Reto21.txt";
        
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(path));
            String line, mathExpression = "";
            while((line = reader.readLine()) != null){
                mathExpression += line;
            }
            reader.close();
            System.out.println(mathExpression);
            multAndDivEval(mathExpression); //Siempre checa primero por multiplicacion y division
            } catch(IOException e){
                e.printStackTrace();
            }
    }
    
    //Esta operacion simplificará la expresion original para solo dejar suma y resta
    //Ej: Le llega 5 + 4 * 2 -> 5 + 8
    private static void multAndDivEval(String expression){
        double result = 0, n1, n2;
        String simplerExpression = expression.replaceAll(" ", "");
        boolean containsMult = expression.indexOf("*") > -1;
        boolean containsDiv = expression.contains("/");
        if(containsMult){
            String[] mult = simplerExpression.split("\\*");
            for(int i = 0; i < mult.length; i+= 2){
                try {
                    String stringN1 = getFirstNum(mult[i]), stringN2 = getSecondNum(mult[i+1]);
                    n1 = Double.parseDouble(stringN1);
                    n2 = Double.parseDouble(stringN2);
                    result = n1 * n2;
                    String replace = stringN1 + "*" + stringN2;
                    int index = simplerExpression.indexOf(replace);
                    simplerExpression = simplerExpression.substring(0, index) + result + simplerExpression.substring(index + replace.length(), simplerExpression.length());
                } catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
                    System.out.println("Hubo un error en la ejecucion: expresion incompleta");
                    System.exit(2);
                    break;
                } catch(ArithmeticException e){
                    System.out.println("Hubo un error en la ejecucion: " + e.getMessage());
                    System.exit(1);
                    break;
                }
            }
        }
        if(containsDiv){
            String[] div = simplerExpression.split("/");
            for(int i = 0; i < div.length; i+= 2){
                try {
                    String stringN1 = getFirstNum(div[i]), stringN2 = getSecondNum(div[i+1]);
                    n1 = Double.parseDouble(stringN1);
                    n2 = Double.parseDouble(stringN2);
                    result = n1 / n2;
                    String replace = stringN1 + "/" + stringN2;
                    int index = simplerExpression.indexOf(replace);
                    simplerExpression = simplerExpression.substring(0, index) + result + simplerExpression.substring(index + replace.length(), simplerExpression.length());
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Hubo un error en la ejecucion: expresion incompleta");
                    System.exit(2);
                    break;
                } catch(ArithmeticException | NumberFormatException e){
                    System.out.println("Hubo un error en la ejecucion: " + e.getMessage());
                    System.exit(1);
                    break;
                }
            }
        }
        sumEval(simplerExpression);
    }
    
    //A esta operaciom siempre le llegan solo sumas y restas
    private static void sumEval(String expression){
        String num = "";
        char operator = 0;
        boolean numberAvailable = false;
        //numberAvailable sirve para checar si el primer numero de la expresion es negativo
        ArrayList<Double> numsList = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
            char current = expression.charAt(i);
            if(isOperator(current) && numberAvailable){
                addToList(numsList, num, operator);
                num = "";
                operator = current;
            } else {
                num += current;
                numberAvailable = true;
            }
        }
        addToList(numsList, num, operator); //Agregar el ultimo numero
        double result = 0;
        for(int i = 0; i < numsList.size(); i++){
            result += numsList.get(i);
        }
        String decimal = String.valueOf(result).split("\\.")[1];
        if(decimal.equals("0")){
            System.out.println(Integer.valueOf((int)result));
        } else {
            System.out.println(result);
        }
    }
    
    private static String getFirstNum(String expression){
        String number = "";
        for(int i = expression.length() - 1; i >= 0; i--){
            char current = expression.charAt(i);
            if(current == '-'){
                number = "-" + number;
                break;
            } else if(isOperator(current)){
                break;
            } else {
                number = current + number;
                continue;
            }
        }
        return number;
    }
    
    private static String getSecondNum(String expression){
        String number = "";
        for(int i = 0; i < expression.length(); i++){
            char current = expression.charAt(i);
            if(current == '-' && i == 0){ //Checar si el numero a multiplicar es negativo
                number = "-";
                continue;
            } else if(current == '-') { //Si el negativo no es el primer simbolo, sabemos que ya es otro numero
                break;
            } else if(isOperator(current)){
                break;
            } else {
                number += current;
                continue;
            }
        }
        return number;
    }
    
    private static boolean isOperator(char value){
        switch(value){
            case '+': case '-': case '/': case '*': case '(': case ')': return true;
            default: return false;
        }
    }
    
    private static void addToList(ArrayList<Double> numsList, String number, char operator){
        try {
            if (operator == 0 || operator == '+') {
                numsList.add(Double.parseDouble(number));
            } else if (operator == '-') {
                numsList.add(Double.parseDouble(operator + number));
            }
        } catch (NumberFormatException e) {
            System.out.println("Se encontrarom caracteres invalidos o faltan numeros");
            System.exit(3);
        }
    }
    
}
