public class Vetor<TipoGenerico> {
    private int tamanho, capacidade;
    private Object[] array;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
        this.tamanho = 0;
    }

    public void insiraNaColocacao(int colocacao, int valor) {
        this.array[colocacao] = valor;
    }

    public void removaNaColocacao(int colocacao) {
        this.array[colocacao] = null;
    }

    public Object elementoNaColocacao(int colocacao) {
        return this.array[colocacao];
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void status() {
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Capacidade: " + this.getCapacidade());
    }

    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>(10);
        vetor.insiraNaColocacao(0, 1);
        System.out.println(vetor.elementoNaColocacao(0));
        vetor.removaNaColocacao(0);
        System.out.println(vetor.elementoNaColocacao(0));
        vetor.status();
    }

}