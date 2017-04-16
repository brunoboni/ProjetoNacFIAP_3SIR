package BookStore.Entity.Entities;

import java.sql.Date;

import BookStore.Business.Filter.Message;

public class Venda {
	    private int id;
	    private int[] id_livro;
	    private int id_forma_pagamento;
		private int id_usuario;
	    private Date data_venda;
	    private Date data_cadastro;
	    private float valor;
	    private boolean ativo;
	    Livro livro;
	    Usuario usuario;
	    
	    public Venda(){
	    	this.livro = new Livro();
	    	this.usuario = new Usuario();
	    }

		

	
		public Venda(int id, int[] id_livro, int id_forma_pagamento, int id_usuario, Date data_venda,
				Date data_cadastro, float valor, boolean ativo, Livro livro, Usuario usuario) {
			super();
			this.id = id;
			this.id_livro = id_livro;
			this.id_forma_pagamento = id_forma_pagamento;
			this.id_usuario = id_usuario;
			this.data_venda = data_venda;
			this.data_cadastro = data_cadastro;
			this.valor = valor;
			this.ativo = ativo;
			this.livro = livro;
			this.usuario = usuario;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int[] getId_livro() {
			return id_livro;
		}


		public void setId_livro(int[] id_livro) {
			this.id_livro = id_livro;
		}


		public int getId_forma_pagamento() {
			return id_forma_pagamento;
		}


		public void setId_forma_pagamento(int id_forma_pagamento) {
			this.id_forma_pagamento = id_forma_pagamento;
		}


		public int getid_usuario() {
			return id_usuario;
		}


		public void setid_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}


		public Date getData_venda() {
			return data_venda;
		}


		public void setData_venda(Date data_venda) {
			this.data_venda = data_venda;
		}


		public Date getData_cadastro() {
			return data_cadastro;
		}


		public void setData_cadastro(Date data_cadastro) {
			this.data_cadastro = data_cadastro;
		}

		public float getValor() {
			return valor;
		}


		public void setValor(float valor) {
			this.valor = valor;
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


		public void IsValid() throws Exception {
			Message error = new Message();

			if (id_usuario == 0) {
				error.ErrorMessage("Venda - Usuario Obrigatorio");
			}

			if (this.valor <= 0) {
				error.ErrorMessage("Venda - Valor obrigatorio");
			}
			if (this.id_livro.length <= 0) {
				error.ErrorMessage("Venda - Necessario haver livros na venda");
			}

		}
}
