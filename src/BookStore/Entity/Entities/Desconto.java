package BookStore.Entity.Entities;

import java.sql.Date;

import BookStore.Business.Filter.Message;

public class Desconto {
	private int id;

	private String nome;
	private float porcentagem;
	private Date data_cadastro;
	private float vigencia;
	private boolean ativo;

	public Desconto(){
		
	}
	
	public Desconto(int id, String nome, float porcentagem, Date data_cadastro, float vigencia, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.porcentagem = porcentagem;
		this.data_cadastro = data_cadastro;
		this.vigencia = vigencia;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public float getVigencia() {
		return vigencia;
	}

	public void setVigencia(float vigencia) {
		this.vigencia = vigencia;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void IsValid() throws Exception {
		Message error = new Message();

		if (nome.isEmpty()) {
			error.ErrorMessage("Desconto - Nome obrigatorio");
		}

		if (this.porcentagem <= 0) {
			error.ErrorMessage("Desconto - Valor de desconto obrigatorio");
		}

	}

}
