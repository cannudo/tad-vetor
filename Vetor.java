public class Vetor<TipoGenerico> {
    private int tamanho, capacidade;
    private Object[] array;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
        this.tamanho = 0;
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
        vetor.status();
    }

}