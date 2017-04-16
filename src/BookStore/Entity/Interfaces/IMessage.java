package BookStore.Entity.Interfaces;

import java.beans.ExceptionListener;

/**
*
* @author BrunoBoni
*/
public interface IMessage {
    void ErrorMessage(String message);
    void SucessMessage(String message);
}
