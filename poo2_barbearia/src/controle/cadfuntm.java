/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author edvar
 */
public abstract class cadfuntm {

	final void nome() {
		telefone();
		endereco();
		cep();
                email();
	}

	abstract void telefone();
	abstract void endereco();
        abstract void cep();
        abstract void email();

	final void treinoTatico() {
		System.out.println("Cadastro");
	}

}

