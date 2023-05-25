package pescariaApi.embarcacao;

import pescariaApi.classesSucessoras.TipoPeixeEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Peixe {
    TipoPeixeEnum tipo;
    double peso;

    //construtor
    public Peixe() {
        tipo = randomTipoPeixe();
        peso = randomPeso(tipo);
    }

    public TipoPeixeEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixeEnum tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public TipoPeixeEnum randomTipoPeixe(){
        ArrayList<TipoPeixeEnum> tiposPeixes = (ArrayList<TipoPeixeEnum>) Arrays.asList(TipoPeixeEnum.ATUM, TipoPeixeEnum.CAVALA);
        Random random = new Random();
        int index = random.nextInt(2);
        return tiposPeixes.get(index);
    }
    public double randomPeso(TipoPeixeEnum tipo){
        Random random = new Random();
        if (tipo == TipoPeixeEnum.ATUM) {
            return random.nextInt(101) +100;
        }
        return random.nextInt(21)+50;
    }


    public String toString(){
        return "Tipo do peixe:"+tipo+", peso: "+peso;
    }


}
