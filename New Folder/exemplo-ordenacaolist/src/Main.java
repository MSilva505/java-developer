import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Davi brito", 18, "preto"));
        meusGatos.add(new Gato("Calabreso", 5, "tigrado"));
        meusGatos.add(new Gato("De gue", 8, "amarelada"));

        System.out.println("ordem de insercao");
        System.out.println(meusGatos);

        System.out.println("ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("ordem natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("ordem por cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("ordem por idade");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("ordem por nome, cor e idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + ", idade=" + idade + ", cor=" + cor + '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

// MOVA ESSAS CLASSES PARA FORA DE QUALQUER OUTRA CLASSE

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
