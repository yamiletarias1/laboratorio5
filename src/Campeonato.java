import java.util.ArrayList;

public class Campeonato {

    public static void main(String[] args) {

        ArrayList<cocheDeCarrera> autos = new ArrayList<>();

        prototipoLM p1 = new prototipoLM("Toyota", "GR010", 330, true);
        prototipoLM p2 = new prototipoLM("Peugeot", "9X8", 320, false);

        autos.add(p1);
        autos.add(p2);

        for (cocheDeCarrera auto : autos) {
            auto.mostrarDatos();
            auto.competir();
        }
    }
}