package Libreta;

public class Telefono {
    private String nombre;
    private String telefono;

    public Telefono(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public static Telefono[] agregarNumero(Telefono[] libreta, Telefono nuevoNumero){
        Telefono[] nuevaLibreta = new Telefono[ libreta.length + 1 ];
        for (int i = 0; i < libreta.length; i++) {
            nuevaLibreta[i] = libreta[i];
        }
        nuevaLibreta[nuevaLibreta.length - 1] = nuevoNumero;
        return nuevaLibreta;
    }

    public static Telefono[] removerUltimaEntrada(Telefono[] libreta){
        Telefono[] nuevaLibreta = new Telefono[ libreta.length -1 ];
        for (int i = 0; i < nuevaLibreta.length; i++) {
            nuevaLibreta[i] = libreta[i];
        }
        return nuevaLibreta;
    }

    public static String listarNumeros(Telefono[] libreta) {
        String respuesta = "";
        if ( libreta.length > 0 ) {
            for (int i=0; i < libreta.length; i++ ) {
                respuesta += "N° "+i+" :"+libreta[i].getNombre()+" - "+libreta[i].getTelefono()+"\n";
            }
        }
        else
            respuesta = "Libreta vacia";
        return respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
