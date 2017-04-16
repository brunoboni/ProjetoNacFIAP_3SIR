package BookStore.Entity.Entities;

import java.sql.Date;

import BookStore.Business.Filter.Message;

public class Livro {

	private int Id;
	private String nome;
	private float valor;
	private int qtd_paginas;
	private int num_edicao;
	private String idioma;
	private int id_editora;
	private int id_autor;
	private Date data_cadastro;
	private int id_assunto;
	private int id_desconto;
	private boolean ativo;
	Editora editora;
	Autor autor;
	Assunto assunto;
	Desconto desconto;

	public Livro() {
		this.editora = new Editora();
		this.autor = new Autor();
		this.assunto = new Assunto();
		this.desconto = new Desconto();
	}

	public Livro(int id, String nome, float valor, int qtd_paginas, int num_edicao, String idioma, int id_editora,
			int id_autor, Date data_cadastro, int id_assunto, int id_desconto, boolean ativo, Editora editora,
			Autor autor, Assunto assunto, Desconto desconto) {

		super();
		Id = id;
		this.nome = nome;
		this.valor = valor;
		this.qtd_paginas = qtd_paginas;
		this.num_edicao = num_edicao;
		this.idioma = idioma;
		this.id_editora = id_editora;
		this.id_autor = id_autor;
		this.data_cadastro = data_cadastro;
		this.id_assunto = id_assunto;
		this.id_desconto = id_desconto;
		this.ativo = ativo;
		this.editora = editora;
		this.autor = autor;
		this.assunto = assunto;
		this.desconto = desconto;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQtd_paginas() {
		return qtd_paginas;
	}

	public void setQtd_paginas(int qtd_paginas) {
		this.qtd_paginas = qtd_paginas;
	}

	public int getNum_edicao() {
		return num_edicao;
	}

	public void setNum_edicao(int num_edicao) {
		this.num_edicao = num_edicao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getId_editora() {
		return id_editora;
	}

	public void setId_editora(int id_editora) {
		this.id_editora = id_editora;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public int getId_assunto() {
		return id_assunto;
	}

	public void setId_assunto(int id_assunto) {
		this.id_assunto = id_assunto;
	}

	public int getId_desconto() {
		return id_desconto;
	}

	public void setId_desconto(int id_desconto) {
		this.id_desconto = id_desconto;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	public void IsValid() throws Exception {
		Message error = new Message();

		if (nome.isEmpty()) {
			error.ErrorMessage("Livro - Nome obrigatorio");
		}

		if (this.valor <= 0) {
			error.ErrorMessage("Livro - Valor obrigatorio");
		}

	}

}
