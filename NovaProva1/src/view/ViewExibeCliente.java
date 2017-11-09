package view;

import javax.swing.JOptionPane;

import model.Cliente;

public class ViewExibeCliente {
	
	public ViewExibeCliente (Cliente cliente){
		if (cliente == null){
			JOptionPane.showMessageDialog(null, "É isso ai como a gente achou que ia ser");
		} else{
			JOptionPane.showMessageDialog(null, cliente);
		}
		
		
	}

	
	
	
}
