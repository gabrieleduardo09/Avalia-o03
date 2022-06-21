package model.vo;

import java.text.DateFormat;
import java.time.LocalDateTime;

public class ChamadoVO {

	private int codChamado;
	private String titulo;
	private String descricao;
	private LocalDateTime dataHoraAbertura;
	private LocalDateTime dataHoraFechamento;
	private String descricaoSolucao;
	private UsuarioVO usuario;
	private UsuarioVO tecnico;

	public ChamadoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChamadoVO(int codChamado, String titulo, String descricao, LocalDateTime dataHoraAbertura,
			LocalDateTime dataHoraFechamento, String descricaoSolucao, UsuarioVO usuario, UsuarioVO tecnico) {
		super();
		this.codChamado = codChamado;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataHoraAbertura = dataHoraAbertura;
		this.dataHoraFechamento = dataHoraFechamento;
		this.descricaoSolucao = descricaoSolucao;
		this.usuario = usuario;
		this.tecnico = tecnico;
	}

	public int getCodChamado() {
		return codChamado;
	}

	public void setCodChamado(int codChamado) {
		this.codChamado = codChamado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHoraAbertura() {
		return dataHoraAbertura;
	}

	public void setDataHoraAbertura(LocalDateTime dataHoraAbertura) {
		this.dataHoraAbertura = dataHoraAbertura;
	}

	public LocalDateTime getDataHoraFechamento() {
		return dataHoraFechamento;
	}

	public void setDataHoraFechamento(LocalDateTime dataHoraFechamento) {
		this.dataHoraFechamento = dataHoraFechamento;
	}

	public String getDescricaoSolucao() {
		return descricaoSolucao;
	}

	public void setDescricaoSolucao(String descricaoSolucao) {
		this.descricaoSolucao = descricaoSolucao;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

	public UsuarioVO getTecnico() {
		return tecnico;
	}

	public void setTecnico(UsuarioVO tecnico) {
		this.tecnico = tecnico;
	}

}
