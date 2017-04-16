package BookStore.Bussines.Repositories;


import BookStore.Business.Connection;
import BookStore.Business.Filter.Message;
import BookStore.Entity.Entities.Assunto;
import BookStore.Entity.Entities.Autor;
import BookStore.Entity.Entities.Desconto;
import BookStore.Entity.Entities.Editora;
import BookStore.Entity.Entities.Livro;
import BookStore.Repository.Interfaces.ILivroRepository;
import BookStore.Entity.Interfaces.Base.IRepositoryBase;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;



public class LivroRepository extends Message implements ILivroRepository{

	 private static java.sql.Connection conexao;
	@Override
	public void Insert(Livro obj) {
		 String sql = "INSERT INTO LIVRO ("
	                + "nome,"
	                + "valor,"
	                + "qtd_paginas,"
	                + "num_edicao,"
	                + "idioma,"
	                + "id_editora,"
	                + "id_autor,"
	                + "data_cadastro,"
	                + "id_assunto,"
	                + "id_desconto,"
	                + "ativo)"
	                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		 
		
	        conexao = Connection.getConnection();
	        PreparedStatement ps = null;

	        try {
	        	
	            ps = conexao.prepareStatement(sql);
	            ps.setString(1, obj.getNome());
	            ps.setFloat(2, obj.getValor());
	            ps.setInt(3, obj.getQtd_paginas());
	            ps.setInt(4, obj.getNum_edicao());
	            ps.setString(5, obj.getIdioma());
	            ps.setInt(6, obj.getEditora().getId());
	            ps.setInt(7, obj.getAutor().getId());
	            ps.setDate(8, obj.getData_cadastro());
	            ps.setInt(9,obj.getAssunto().getId());
	            ps.setInt(10, obj.getDesconto().getId());
	            ps.execute();

	        } catch (SQLException e) {
	            ErrorMessage("Erro ao Inserir Livro.\n" + e);
	        }
		
	}

	@Override
	public Livro GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(Livro obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Livro obj) {
		
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Livro> GetAll() {
		  String sql = "SELECT * FROM LIVRO ";

	        conexao = Connection.getConnection();
	        ResultSet rs = null;
	        PreparedStatement ps = null;
	        ArrayList<Livro> retorno = new ArrayList<Livro>();

	        try {

	            ps = conexao.prepareStatement(sql);
	            rs = ps.executeQuery();

	            while (rs.next()) {
	                int Id = rs.getInt(1);
	                String nome = rs.getString(2);
	                float valor = rs.getFloat(3);
	                int qtd_paginas = rs.getInt(4);
	                int num_edicao = rs.getInt(5);
	                String idioma= rs.getString(6);
	                int id_editora = rs.getInt(7);
	                int id_autor = rs.getInt(8);
	                Date data_cadastro = rs.getDate(9);
	                int id_assunto = rs.getInt(10);
	                int id_desconto = rs.getInt(11);
	                boolean ativo = rs.getBoolean(12);

	                retorno.add(new Livro(Id,nome,valor,qtd_paginas,num_edicao,idioma,id_editora,
	                		id_autor,data_cadastro,id_assunto,id_desconto,ativo,new Editora(),new Autor(),new Assunto(),new Desconto()));
	              
	            }

	        } catch (SQLException e) {
	            ErrorMessage("Erro ao Buscar livros.\n" + e);
	        }
	        return retorno;
	}

}
