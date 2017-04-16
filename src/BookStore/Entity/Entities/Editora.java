package BookStore.Entity.Entities;
import java.sql.Date;

import BookStore.Business.Filter.Message;

public class Editora {

	    private int id;
	    private String nome; 
	    private Date data_cadastro;
	    private boolean ativo;
		
	    public Editora(){
	    	
	    }
		public Editora(int id, String nome, Date data_cadastro, boolean ativo) {
			super();
			this.id = id;
			this.nome = nome;
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
		
		 public void IsValid()throws Exception {
			 Message error = new Message();
			
		        if (nome.isEmpty()) {
		        	error.ErrorMessage("Editora - Nome obrigatorio");
		        }

		    }
	    
}
