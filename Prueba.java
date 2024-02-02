public class Main {
    // Creacion del CD
    Cd pruCd = new Cd();
    pruCd.setDatos("Sony");// Actualizacion de la marca del CD

    // Creacion del Disco Duro
    DiscoDuro pruDisco = new DiscoDuro();
    pruDisco.setDatos("Samsung");// Actualizacion de la marca del Disco Duro

    // Ejecucion de los compartimentos
    pruCd.giraDisco();
    pruCd.almacenaDatos();
    pruCd.leerDatos();
    pruCd.muestraInfo();

    System.out.println();// Separador de lineas

    pruDisco.girarDisco();
    pruDisco.almacenaDatos();
    pruDisco.leerDatos();
    pruDisco.muestraInformacion();
}