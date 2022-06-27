package executavel;

import model.vo.UsuarioVO;
import view.TelaLogin;
import view.TelaPrincipal;

public class Executavel {

	public static void main(String[] args) {
		UsuarioVO usuarioVO = new UsuarioVO();
		TelaLogin telaLogin = new TelaLogin();
		//telaLogin.apresentarTelaLogin(usuarioVO);
		
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		telaPrincipal.apresentarTelaPrincipal(usuarioVO);

	}

}