/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradores;

import abstracao.Subject;

/**
 *
 * @author aluno
 */
public class GeradorRelatorioCompras extends Subject {

    @Override
    protected void gerarCabecalho() {
        System.out.println("CABEÇALHO DE COMPRAS!");
    }

    @Override
    protected void gerarRodape() {
        System.out.println("RODAPÉ DE COMPRAS!");
    }
    
}
