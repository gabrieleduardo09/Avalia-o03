package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.vo.UsuarioVO;

public class TelaPrincipal {

	private JFrame framePrincipal;
	private JTable tabela01;
	private JPanel painelDireit;
	private DefaultTableModel model;
	private FlowLayout fy, fyDireita;
	private JScrollPane sp;
	private JCheckBox checkbox;
	private JDesktopPane painelDireita;
	private JInternalFrame in, in2;
	private JButton b, b1, b2;

	public void apresentarTelaPrincipal(UsuarioVO usuarioVO) throws ClassNotFoundException {
		framePrincipal = new JFrame("Tela Principal");
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setSize(new Dimension(1350, 720));

		fy = new FlowLayout();
		framePrincipal.setLayout(fy);

		apresentarTabela01();
		painelDireita();

		checkbox = new JCheckBox();
		checkbox.setText("Exibir Todos os Chamados");
		framePrincipal.add(checkbox);
		checkbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(checkbox.isSelected());
			}
		});

		dimensao();
		framePrincipal.setVisible(true);

	}

	private void painelDireita() {
		painelDireita = new JDesktopPane();
		painelDireita.setBackground(Color.BLUE);
		painelDireita.setPreferredSize(new Dimension(635, 600));
		framePrincipal.add(painelDireita);
		painelDireita.setLayout(new FlowLayout(FlowLayout.RIGHT));

		//painel = new JDesktopPane();
		//painelDireita.setBackground(Color.LIGHT_GRAY);
		//framePrincipal.setContentPane(painelDireita);
		in = new JInternalFrame("My Internal Frame - Title");
		fyDireita = new FlowLayout();
		in.setLayout(fyDireita);
		in.setClosable(true);
		in.setResizable(true);
		in.setMaximizable(true);
		in.setIconifiable(true);
		in.setPreferredSize(new Dimension(300,300));
		in.setVisible(true);
		in.pack();
		painelDireita.add(in);
		
		in2 = new JInternalFrame("My Internal Frame - Title");
		fyDireita = new FlowLayout();
		in2.setLayout(fyDireita);
		in2.setClosable(true);
		in2.setResizable(true);
		in2.setMaximizable(true);
		in2.setIconifiable(true);
		in2.setPreferredSize(new Dimension(300,300));
		in2.setVisible(true);
		in2.pack();
		painelDireita.add(in2);
		
	}

	private void apresentarTabela01() throws ClassNotFoundException {
		String[][] dados = { { "campo01", "campo02", " campo03" }, { "campo011", "campo022", "campo033" } };
		String[] columnNames = { "Código", "Data/Horário de Abertura", "Título" };

		tabela01 = new JTable(dados, columnNames);
		model = new DefaultTableModel(dados, columnNames);
		tabela01 = new JTable(model);
		framePrincipal.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		tabela01.getTableHeader().setReorderingAllowed(false); // TRAVA AS COLUNAS

		sp = new JScrollPane(tabela01);
		sp.setPreferredSize(new Dimension(640, 600));
		framePrincipal.add(sp);

	}

	public void dimensao() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth = framePrincipal.getSize().width;
		int frameHeight = framePrincipal.getSize().height;
		int locationX = (int) (width - frameWidth) / 2;
		int locationY = (int) (height - frameHeight) / 2;
		framePrincipal.setLocation(locationX, locationY);
	}

}
