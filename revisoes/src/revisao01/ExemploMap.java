package revisao01;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();
        Pessoa joao = new Pessoa(1L, "Joao");

        mapa.put(1L, joao);

        Pessoa joao2 = mapa.get(1L);
    }
}
