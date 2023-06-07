package pescariaApi.Empresa.entidades;

import pescariaApi.Empresa.entidades.Financeiro.Resgistros.Registro;

public class Barco {

    public Registro registro;

    public Barco(Registro registro) {
        this.registro = registro;
        Pescaria.adicionarBarco(this);
    }
}
