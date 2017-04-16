package BookStore.Entity.Entities;

import java.sql.Date;

public class Desejos {
	private int Id;
    private int  id_usuario;
    private int id_livro;
    private Date data_cadastro;
    private boolean ativo;
    Livro livro;
    Usuario usuario;
	
    
    public Desejos(){
    	this.livro = new Livro();
    	this.usuario = new Usuario();
    }
    
    public Desejos(int id, int id_usuario, int id_livro, Date data_cadastro, boolean ativo, Livro livro,
			Usuario usuario) {
		super();
		Id = id;
		this.id_usuario = id_usuario;
		this.id_livro = id_livro;
		this.data_cadastro = data_cadastro;
		this.ativo = ativo;
		this.livro = livro;
		this.usuario = usuario;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public int getId_livro() {
		return id_livro;
	}


	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
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


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
    
    
}
