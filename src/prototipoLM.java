public class prototipoLM extends cocheDeCarrera {

    private boolean sistemaHibrido;

    public prototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }
    @Override
    public void competir() {
        if (sistemaHibrido) {
            System.out.println("Este prototipo usa sistema hibrido");
        } else {
            System.out.println("Este prototipo usa solo motor normal");
        }
    }
}