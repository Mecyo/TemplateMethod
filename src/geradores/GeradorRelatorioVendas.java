package geradores;

import abstracao.Subject;

/**
 *
 * @author aluno
 */
public class GeradorRelatorioVendas extends Subject {

    @Override
    protected void gerarCabecalho() {
        System.out.println("CABEÇALHO DE VENDAS!");
    }

    @Override
    protected void gerarRodape() {
        System.out.println("RODAPÉ DE VENDAS!");
    }
    
}
