public class granTurismo {

    public class GranTurismo extends cocheDeCarrera{

        private int pesoExtraLastre;

        public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
            super(marca, modelo, velocidadMaxima);
            this.pesoExtraLastre = pesoExtraLastre;
        }


        public void competir() {
            System.out.println("Corre con un lastre extra de " + pesoExtraLastre + " kg");
        }
    }

}
