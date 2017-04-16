package BookStore.Business.Filter;




import BookStore.Entity.Interfaces.IMessage;
import javax.swing.JOptionPane;

public class Message implements IMessage{
    @Override
    public void ErrorMessage(String message) {
    	//Chamar a classe de erros e inserir a mensagem de erro
    	
    	
        
    }

    @Override
    public void SucessMessage(String message) {
    //Chamar a classe de Sucesso e inserir a mensagem de operação concluida	
    }

	
}
