public class DiscoDuro {
    private String datos;

    public DiscoDuro() {
        this.datos = "";
    }

    // Metodo para obtener datos del Disco Duro
    public String getDatos() {
        return datos;
    }

    // Metodo para actualizar los datos del Disco Duro
    public void setDatos(String datos) {
        this.datos = datos;
    }

    // Metodo para girar Disco Duro
    public void giraDisco() {
        System.out.println("Disco girando...");
    }

    // Metodo para almacenar los datos en el Disco Duro
    public void almacenaDatos() {
        System.out.println("Almacenando datos en el disco duro");
    }

    // Metodo para leer datos en el Disco Duro
    public void leerDatos() {
        System.out.println("Leyendo datos del disco duro");
    }

    // Metodo para mostrar informacion del Disco Duro
    public void muestraInfo() {
        System.out.println("Información del Disco Duro - Marca: " + this.datos);
    }
}