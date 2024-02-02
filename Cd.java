public class Cd {
    private String datos;

    public Cd() {
        this.datos = "";
    }

    // Metodo para obtener datos del CD
    public String getDatos() {
        return datos;
    }

    // Metodo para actualizar los datos del CD
    public void setDatos(String datos) {
        this.datos = datos;
    }

    // Método para girar el CD
    public void giraDisco() {
        System.out.println("CD girando...");
    }

    // Método para almacenar datos en el CD
    public void almacenaDatos() {
        System.out.println("Almacenando datos en el CD");
    }

    // Metodo para leer datos del CD
    public void leerDatos() {
        System.out.println("Leyendo datos del CD");
    }

    // Metodo para devolver la informacion del CD
    public void muestraInfo() {
        System.out.println("Información del CD - Marca: " + this.datos);
    }
}