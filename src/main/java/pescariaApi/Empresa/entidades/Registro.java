package pescariaApi.Empresa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    List<Pesca> pescas = new ArrayList<>();

    public void setPescas(List<Pesca> pescas) {
        this.pescas = pescas;
    }

    public List<Pesca> getPescas() {
        return pescas;
    }

    public Pesca getPesca(int index){
        return pescas.get(index);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "pescas=" + pescas +
                '}';
    }
}
