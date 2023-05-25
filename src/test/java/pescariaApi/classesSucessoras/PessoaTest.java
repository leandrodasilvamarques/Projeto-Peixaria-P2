package pescariaApi.classesSucessoras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pessoa = new Pessoa();
        pessoa.setNome("lucas");
    }

    @Test
    void testaSetNome(){
        pessoa.setNome("And");
        assertEquals("And", pessoa.getNome());
    }

    @Test
    void testGet() {
        assertEquals("lucas", pessoa.getNome());
    }
}