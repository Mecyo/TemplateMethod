package abstracao;

/**
 *
 * @author aluno
 */
public abstract class Subject {
    
    
    public void gerarRelatorio() {
        this.gerarCabecalho();
        System.out.println("XXXXX DADOS CENTRAIS DO RELATÓRIO XXXX");
        this.gerarRodape();
        
    }
    
    protected abstract void gerarCabecalho();
    
    protected abstract void gerarRodape();
}
