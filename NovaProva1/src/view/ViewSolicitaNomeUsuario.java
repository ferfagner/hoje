package view;

import javax.swing.JOptionPane;

public class ViewSolicitaNomeUsuario {
	private String Nome;
	//metodos
	public String getNome() {
		return Nome;
	}
	//pedido
	public ViewSolicitaNomeUsuario(){
		this.Nome = 
		 JOptionPane.showInputDialog("Digite o Nome");
	}
	
}


