public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        persona.setNombre("Max");
        persona.setTelefono(312456742);

        System.out.println("la persona tiene" + persona.getEdad() + " Años, y su nombre es " + persona.getNombre() + " y su telefono es " + persona.getTelefono());


    }

    static class Persona{
        private int edad;
        private String nombre;
        private long telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
    }
}