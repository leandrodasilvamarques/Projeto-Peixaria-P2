package pescariaApi.peixes;

import pescariaApi.interfaces.Peixe;

public class Sardinha implements Peixe {

    @Override
    public double getPrecoQuilo() {
        return 5.0;
    }
}
