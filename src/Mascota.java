public class Mascota {
    private String nombre;
    private int edad;
    private String comida;
    private String sonido;

    public Mascota(String nombre, int edad, String comida, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.sonido = sonido;
    }

    public void mostrarInformacion() {
        System.out.println(nombre + " tiene " + edad + " años");
        System.out.println(nombre + " come " + comida + " y hace " + sonido);
    }
}
