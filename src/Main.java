public class Main {
    public static void main(String[] args) {
        Mascota dog = new Mascota("Firulay", 2, "un kilo y medio", "guau guau");
        Mascota fish = new Mascota("Nemo", 1, "140 gramos", "glub glub");
        Mascota cat = new Mascota("Catzilla", 3, "medio kilo", "miau miau");
        Mascota turtle = new Mascota("Flash", 12, "300 gramos", "aaaaaaaa");
        Mascota canary = new Mascota("Plumitas", 1, "350 gramos", "pio pio");

        System.out.println("----------");
        dog.mostrarInformacion();
        System.out.println("----------");
        cat.mostrarInformacion();
        System.out.println("----------");
        fish.mostrarInformacion();
        System.out.println("----------");
        turtle.mostrarInformacion();
        System.out.println("----------");
        canary.mostrarInformacion();

    }
}