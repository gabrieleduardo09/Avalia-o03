package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.vo.UsuarioVO;

public class TelaLogin {

	private JFrame frameLogin;
	private JPanel painelLogin;
	
	public void apresentarTelaLogin(UsuarioVO usuarioVO) {
		frameLogin = new JFrame("Login");
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.setSize(new Dimension(400, 200));
		painelLogin = new JPanel();
		painelLogin.add(new JLabel("Login: "));
		painelLogin.add(new JTextField(34));
		painelLogin.add(new JLabel("Senha: "));
		painelLogin.add(new JTextField(34));
		painelLogin.add(new JButton("Entrar"));
		painelLogin.add(new JButton("Cancelar"));
		
		dimensao();
		frameLogin.add(painelLogin);
		frameLogin.setVisible(true);
	}
	
	public void dimensao() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth =  frameLogin.getSize().width;
		int frameHeight =  frameLogin.getSize().height;
		int locationX = (int)(width - frameWidth) / 2;
		int locationY = (int)(height - frameHeight) / 2;
		frameLogin.setLocation(locationX, locationY);
	}

}
