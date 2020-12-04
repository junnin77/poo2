/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

/**
 *
 * @author edvar
 */
public class singleton {
    
    private static singleton uniqueInstance;

	private singleton() {
	}

	public static synchronized singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new singleton();

		return uniqueInstance;
	}
    
}
