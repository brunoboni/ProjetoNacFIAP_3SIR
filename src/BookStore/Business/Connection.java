package BookStore.Business;



import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author BrunoBoni
 */
public class Connection {

    private static java.sql.Connection conexao;
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private static String usuario = "OPS$RM73974";
    private static String senha = "271088";

    public static java.sql.Connection getConnection() {

        if (conexao == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel carregar o driver de conexao.\n\nErro: " + e);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao estabelecer conexao com o banco de dados.\nErro: " + e);
            }
        }
        return conexao;

    }

}
