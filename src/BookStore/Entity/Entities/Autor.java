package BookStore.Entity.Entities;

import java.sql.Date;

import BookStore.Business.Filter.Message;

public class Autor {

	private int id;
	private String nome;
	private String nacionalidade;
	private String estilo;
	private Date data_cadastro;
	private boolean ativo;
	
	public Autor(){
		
	}
	public Autor(int id, String nome, String nacionalidade, String estilo, Date data_cadastro, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
		this.data_cadastro = data_cadastro;
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


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public Date getData_cadastro() {
		return data_cadastro;
	}


	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
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
			error.ErrorMessage("Autor - Nome obrigatorio");
		}

		if (this.nacionalidade.isEmpty()) {
			error.ErrorMessage("Autor - Nacionalidade Obrigatoria");
		}

	}
}
