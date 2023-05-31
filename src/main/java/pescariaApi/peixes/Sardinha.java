package pescariaApi.peixes;

import pescariaApi.classesDeMetodos.AcoesAdmin;
import pescariaApi.classesDeMetodos.AcoesUsuario;
import pescariaApi.interfaces.Peixe;

public class Sardinha implements Peixe {

    AcoesAdmin acoesAdmin;

    AcoesUsuario acoesUsuario;

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
