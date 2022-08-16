package Aula14_PadraoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jbdcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jbdcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jbdcDriver = jbdcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jbdcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:medicamentos;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarComBancoDeDados() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(dbUrl,nomeUsuario,senha);

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

}
