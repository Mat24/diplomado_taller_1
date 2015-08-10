package Calculo;

public class Calculadora {

    public static double porcentajeAB(double a, double b) {
        /*
        * Ej: a = 2, b = 8
        * resultado = (2 * 100)/8
        * resultado = 25%
        * */
        return (a * 100)/b;
    }

    public static double reglaDe3Simple(double a, double b,double c) {
        return (b * c)/a;
    }

    public static double imc(double peso, double altura) {
        return peso * (altura * altura);
    }

    public static String rangoImc(int imc) {
        String respuesta = "";
        if ( (imc > 0) && (imc < 18) )
            respuesta = "Peso bajo";
        else if ( ( imc >= 18 ) && ( imc < 25 ) )
            respuesta = "Normal";
        else if ( ( imc >= 25 ) && ( imc < 27 ) )
            respuesta = "Sobrepeso";
        else if ( ( imc >= 27 ) && ( imc < 30 ) )
            respuesta = "Obesidad grado 1";
        else if ( ( imc >= 30 ) && ( imc < 40 ) )
            respuesta = "Obesidad grado 2";
        else if ( ( imc >= 40 ) )
            respuesta = "Obesidad grado 3";
        else
            respuesta = "El IMC Regristrado:"+imc+", es un valor invalido";
        return respuesta;
    }

    public static double dividir(double a, double b) {
        // si alguno de los 2 operandos es 0 retorna 0
        return (( a != 0 ) && ( b != 0 )) ? ( a / b ) : 0;
    }




}
