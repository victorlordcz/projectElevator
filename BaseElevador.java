import java.util.concurrent.TimeUnit;

public abstract class BaseElevador implements IElevador {
    // Atributos da Classe
    protected int andar_atual = 0;
    protected int total_andares;
    protected int capacidade;
    protected int pessoas_dentro;

    // Constantes
    private final int SOBE = 1;
    private final int DESCE = -1;

    /*
     * Método painel: Exibe painel do Elevador
     */
    public void painel() {
        System.out.print('\u000C');
        for (int i = this.getTotalAndares(); i >= 0; i--) {
            if (this.getAndarAtual() == i) {
                System.out.printf("%2d [%2d] %n", i, this.getPessoasDentro());
            } else {
                System.out.printf("%2d ---- %n", i);
            }
        }
    }

    /*
     * Método GoTo: movimenta o elevador para o andar desejado (to)
     */
    public void goTo(int to) {
        int total_andares = this.getTotalAndares();
        int from = this.getAndarAtual();
        /* Testa se é possível ir para o andar */
        if (to >= 0 && to <= total_andares) {
            // movimenta o elevador
            if (to > from) {
                for (int i = from; i < to; i++) {
                    this.movimenta(this.SOBE);
                }
            } else {
                for (int i = from; i > to; i--) {
                    this.movimenta(this.DESCE);
                }
            }
        }
    }

    /*
     * Método movimenta: faz elevador subir ou descer conforme a direcao
     */
    public void movimenta(int direcao) {
        timer(1);
        if (direcao == this.SOBE) {
            this.sobe();
        } else {
            this.desce();
        }
        this.painel();
    }

    /*
     * Function timer: espera seconds (s) para continuar
     */
    static void timer(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
