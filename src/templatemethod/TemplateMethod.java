
package templatemethod;

import abstracao.Subject;
import geradores.GeradorRelatorioCompras;
import geradores.GeradorRelatorioVendas;

/**
 *
 * @author aluno
 */
public class TemplateMethod {

    private Subject subject;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TemplateMethod client = new TemplateMethod();
        
        client.setSubject(new GeradorRelatorioCompras());
        
        client.gerarRelatorio();
        
        System.out.println("\n\n\n\n");
        
        client.setSubject(new GeradorRelatorioVendas());
        
        client.gerarRelatorio();
    }
    
    private void gerarRelatorio() {
        subject.gerarRelatorio();
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
}
