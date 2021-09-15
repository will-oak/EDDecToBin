package view;

import javax.swing.JOptionPane;

import controller.Conversor;

public class Principal {

	public static void main(String[] args) {
		Conversor controller = new Conversor();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor"));
		String convertido = controller.decToBin(decimal);
		System.out.println(convertido);
	}

}