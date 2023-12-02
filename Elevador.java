public class Elevador extends BaseElevador {
    // Construtor
    public Elevador(int capacidade, int total_andares) {
        this.setCapacidade(capacidade);
        this.setTotalAndares(total_andares);
        this.setAndarAtual(0);
        this.setPessoasDentro(0);
    }

    // Implementação dos métodos abstratos da interface IElevador

    public void entra(int pessoas) {
        if (this.getPessoasDentro() + pessoas <= this.getCapacidade()) {
            this.setPessoasDentro(this.getPessoasDentro() + pessoas);
        } else {
            System.out.println("Capacidade máxima excedida. Não é possível entrar todas as pessoas.");
        }
    }

    public void sai(int pessoas) {
        if (this.getPessoasDentro() - pessoas >= 0) {
            this.setPessoasDentro(this.getPessoasDentro() - pessoas);
        } else {
            System.out.println("Não há pessoas suficientes dentro do elevador para sair.");
        }
    }

    public void sobe() {
        if (this.getAndarAtual() < this.getTotalAndares()) {
            this.setAndarAtual(this.getAndarAtual() + 1);
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    public void desce() {
        if (this.getAndarAtual() > 0) {
            this.setAndarAtual(this.getAndarAtual() - 1);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public void setAndarAtual(int andar) {
        this.andar_atual = andar;
    }

    public int getAndarAtual() {
        return this.andar_atual;
    }

    public void setTotalAndares(int total) {
        this.total_andares = total;
    }

    public int getTotalAndares() {
        return this.total_andares;
    }

    public void setPessoasDentro(int npessoas) {
        this.pessoas_dentro = npessoas;
    }

    public int getPessoasDentro() {
        return this.pessoas_dentro;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }
}