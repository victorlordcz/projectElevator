public interface IElevador {
    public void entra(int pessoas);

    public void sai(int pessoas);

    public void sobe();

    public void desce();

    public void setAndarAtual(int andar);

    public int getAndarAtual();

    public void setTotalAndares(int total);

    public int getTotalAndares();

    public void setPessoasDentro(int npessoas);

    public int getPessoasDentro();

    public void setCapacidade(int capacidade);

    public int getCapacidade();
}
