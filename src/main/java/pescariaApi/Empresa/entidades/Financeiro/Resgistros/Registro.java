package pescariaApi.Empresa.entidades.Financeiro.Resgistros;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    List<Pesca> pescas = new ArrayList<>();

    public List<Pesca> getPescas() {
        return pescas;
    }

    public Pesca getPesca(int index){
        return pescas.get(index);
    }

    public int adicionarPesca(Pesca pesca){
        pescas.add(pesca);
        return pescas.indexOf(pesca);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Registro de Pescas: \n");
        for (Pesca pesca : pescas) {
            stringBuilder.append(pesca).append("\n");
        }
        return stringBuilder.toString();
    }
}
