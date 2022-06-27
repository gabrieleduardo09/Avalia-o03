package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.vo.UsuarioVO;

public class TelaPrincipal {

	private JFrame framePrincipal;
	private JTable tabela01;
	
	public void apresentarTelaPrincipal(UsuarioVO usuarioVO) {
		framePrincipal = new JFrame("Tela Principal");
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setSize(new Dimension(1300, 700));
		
		apresentarTabela01();
		dimensao();
		framePrincipal.setVisible(true);
		
	}
	
	private void apresentarTabela01() {
//		String [][] dados = {
//			{"campo01", "campo02, campo03"}, {"campo011", "campo022", "campo033"}
//		};
//		String [] columnNames = {"Name", "Address", "Email" };
//		
//		tabela01 = new JTable (dados, columnNames);
//		tabela01.setBounds (30, 40, 200, 300);
//		JScrollPane sp = new JScrollPane(tabela01);
//		framePrincipal.add(sp);
//		framePrincipal.setSize(500, 200);
//		framePrincipal.setVisible(true);
		
	}

	public void dimensao() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth =  framePrincipal.getSize().width;
		int frameHeight =  framePrincipal.getSize().height;
		int locationX = (int)(width - frameWidth) / 2;
		int locationY = (int)(height - frameHeight) / 2;
		framePrincipal.setLocation(locationX, locationY);
	}

}
