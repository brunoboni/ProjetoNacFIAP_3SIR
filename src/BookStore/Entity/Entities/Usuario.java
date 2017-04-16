package BookStore.Entity.Entities;

import BookStore.Business.Filter.Message;

import java.sql.Date;

public class Usuario {

	private int id;
	private String email;
	private String nome;
	private String senha;
	private int id_perfil;
	private String cpf;
	private String rg;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String numero;
	private String cep;
	private Date data_cadastro;
	private boolean ativo;
	Perfil perfil;

	public Usuario() {
		this.perfil = new Perfil();
	}

	public Usuario(int id, String email, String nome, String senha, int id_perfil, String cpf, String rg, String rua,
			String bairro, String cidade, String estado, String pais, String numero, String cep, Date data_cadastro,
			boolean ativo, Perfil perfil) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.id_perfil = id_perfil;
		this.cpf = cpf;
		this.rg = rg;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.numero = numero;
		this.cep = cep;
		this.data_cadastro = data_cadastro;
		this.ativo = ativo;
		this.perfil = perfil;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public void IsValid() throws Exception {
		Message error = new Message();

		if (nome.isEmpty()) {
			error.ErrorMessage("Perfil - Nome obrigatorio");
		}
		if (this.senha.isEmpty() || this.senha.length() > 8) {
			error.ErrorMessage("Perfil - A senha é obrigatoria e deve conter no minimo 8 caracteres.");
		}
		if (this.cpf.isEmpty()) {
			error.ErrorMessage("Perfil - CPF obrigatorio.");
		}
		if (this.cep.isEmpty()) {
			error.ErrorMessage("Perfil - CEP obrigatorio.");
		}
		if (this.numero.isEmpty()) {
			error.ErrorMessage("Perfil - Numero obrigatorio.");
		}

	}

}
