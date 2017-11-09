package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Cliente;
import view.ViewExibeCliente;
import view.ViewSolicitaNomeUsuario;

public class ControleExibeClienteNome {
	public BDSimulado bds;
	
	public ControleExibeClienteNome (BDSimulado bds){
		this.bds = bds;
		
	}
	public void PesquisarCliente(){
		
		ViewSolicitaNomeUsuario vsnu = new ViewSolicitaNomeUsuario();
		String nome = vsnu.getNome();
		
	
		Cliente cli = this.bds.getInfoCliente(nome);
		
		ViewExibeCliente vec = new ViewExibeCliente(cli);
	}
	
	
}
