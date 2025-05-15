package set.ex;

import java.util.*;

public class ExercicioDeSet {

    public static void main(String[] args) {

        Set<ArcoIris> cores = new HashSet<>();
        cores.add(new ArcoIris("vermelho"));
        cores.add(new ArcoIris("laranja"));
        cores.add(new ArcoIris("amarelo"));
        cores.add(new ArcoIris("verde"));
        cores.add(new ArcoIris("azul"));
        cores.add(new ArcoIris("anil"));
        cores.add(new ArcoIris("violeta"));

        // Exibir todas as cores
        System.out.println("Cores no conjunto:");
        for (ArcoIris cor : cores) {
            System.out.println(cor.getCor());
        }

        // Tamanho do conjunto
        System.out.println("\nQuantidade de cores: " + cores.size());

        // Cores que começam com "v"
        System.out.println("\nCores que começam com 'v':");
        for (ArcoIris cor : cores) {
            if (cor.getCor().toLowerCase().startsWith("v")) {
                System.out.println(cor.getCor());
            }
        }

        // Remover as que começam com "v"
        Iterator<ArcoIris> iterator = cores.iterator();
        while (iterator.hasNext()) {
            ArcoIris cor = iterator.next();
            if (cor.getCor().toLowerCase().startsWith("v")) {
                iterator.remove();
            }
        }

        System.out.println("\nCores após remover as que começam com 'v':");
        for (ArcoIris cor : cores) {
            System.out.println(cor.getCor());
        }

        // Ordem alfabética com TreeSet
        Set<ArcoIris> coresOrdenadas = new TreeSet<>(new CompareNome());
        coresOrdenadas.addAll(cores);
        System.out.println("\nCores em ordem alfabética:");
        for (ArcoIris cor : coresOrdenadas) {
            System.out.println(cor.getCor());
        }

        // Ordem inversa da inserção (reverte a lista)
        List<ArcoIris> listaReversa = new ArrayList<>(cores);
        Collections.reverse(listaReversa);
        System.out.println("\nCores em ordem inversa da inserção:");
        for (ArcoIris cor : listaReversa) {
            System.out.println(cor.getCor());
        }
    }
}
class ArcoIris {
    private String cor;

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ArcoIris)) return false;
        ArcoIris other = (ArcoIris) obj;
        return cor.equalsIgnoreCase(other.cor);
    }

    @Override
    public String toString() {
        return cor;
    }
}
class CompareNome implements Comparator<ArcoIris> {
    @Override
    public int compare(ArcoIris c1, ArcoIris c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}
