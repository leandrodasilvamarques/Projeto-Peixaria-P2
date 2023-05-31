package pescariaApi.peixes;

import pescariaApi.interfaces.Peixe;

public class Sardinha implements Peixe {

    final double PRECO_QUILO = 3.0;

    @Override
    public double getPrecoQuilo() {
        return PRECO_QUILO;
    }
    @Override
    public Class<?> getTipo() {
        return this.getClass();
    }
}
