package atividadefinal;
import java.util.*;

public class BancoDeDados {
    private final Map<String, List<Integer>> dados;

    public BancoDeDados() {
        dados = new HashMap<>();
        dados.put("sequencial", new ArrayList<>());
        dados.put("condicional", new ArrayList<>());
        dados.put("repeticao", new ArrayList<>());
    }

    public void salvar(String tipo, int exercicio) {
        if (dados.containsKey(tipo)) {
            dados.get(tipo).add(exercicio);
        }
    }

    public void mostrarResumo() {
        System.out.println("\n--- Resumo dos Exercícios ---");
        dados.forEach((tipo, lista) -> {
            System.out.println("Tipo: " + tipo + " → Exercícios: " + lista);
        });
    }
}

