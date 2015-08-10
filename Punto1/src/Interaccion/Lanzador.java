package Interaccion;

import Calculo.Calculadora;

import javax.swing.*;


public class Lanzador {
    public static void main(String[] args) {
        byte opcionMenu;
        String menu = "******************** MENU ********************\n" +
                "(1) Porcentaje\n" +
                "(2) Regla de 3\n" +
                "(3) Calculadora IMC\n" +
                "(4) Division\n" +
                "(5) Diccionario\n" +
                "(6) Salir";
        // Bucle infinito hasta seleccionar la opcion correcta
        do {
            opcionMenu = Byte.parseByte(JOptionPane.showInputDialog(menu));
            double a, b, c, peso, altura;
            switch (opcionMenu) {
                case 1:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor:"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor:"));
                    JOptionPane.showMessageDialog(null,"El resultado es:"+ Calculadora.porcentajeAB(a,b));
                    break;
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor:"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor:"));
                    c = Double.parseDouble(JOptionPane.showInputDialog("Digite el tercer valor:"));
                    JOptionPane.showMessageDialog(null,"El resultado es:"+ Calculadora.reglaDe3Simple(a,b,c));
                    break;
                case 3:
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Digite el peso en Kilogramos:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura en metros:"));
                    JOptionPane.showMessageDialog(null,"El resultado es:"+ Calculadora.rangoImc((int) Calculadora.imc(peso,altura)));
                    break;
                case 4:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor:"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor:"));
                    if ( ( a != 0 ) && ( b != 0 ) )
                        JOptionPane.showMessageDialog(null,"El resultado es:"+ Calculadora.dividir(a,b));
                    else
                        JOptionPane.showMessageDialog(null,"Error! Alguno de los valores digitados es cero, operacion abortada");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"En construccion");
                    break;
                case 6:
                    return;
            }
        }while(true);
    }
}
