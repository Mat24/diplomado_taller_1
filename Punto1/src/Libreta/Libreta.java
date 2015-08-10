package Libreta;

import javax.swing.*;

public class Libreta {
    public static void main(String[] args) {
        byte opcionMenu;
        String nombre, telefono;
        Telefono[] miLibreta = new Telefono[0];
        String menu = "******************** MENU ********************\n" +
                "(1) Añadir numero\n" +
                "(2) Remover ultima entrada\n" +
                "(3) Mostrar todos los numeros\n" +
                "(4) Salir";
        do {
            opcionMenu = Byte.parseByte(JOptionPane.showInputDialog(menu));
            switch (opcionMenu) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Digite el nuevo nombre");
                    telefono = JOptionPane.showInputDialog("Digite el nuevo numero");
                    miLibreta = Telefono.agregarNumero(miLibreta, new Telefono(nombre, telefono));
                    break;
                case 2:
                    if (miLibreta.length > 0) {
                        miLibreta = Telefono.removerUltimaEntrada(miLibreta);
                        JOptionPane.showMessageDialog(null,"Ultima entrada eliminada satisfactoriamente...");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null,"No Existen entradas para borrar");
                        break;
                    }
                case 3:
                    JOptionPane.showMessageDialog(null,Telefono.listarNumeros(miLibreta));
                    break;
                case 4:
                    return;

            }
        }while(true);

    }
}
