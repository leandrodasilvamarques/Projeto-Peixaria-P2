package classes;

import controladores.Pescaria;

public class Barco {

    public Registro registro;

    public Barco(Registro registro) {
        this.registro = registro;
        Pescaria.adicionarBarco(this);
    }
}
