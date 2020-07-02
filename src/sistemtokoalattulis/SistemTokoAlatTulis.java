package sistemtokoalattulis;

import java.sql.SQLException;
import view.Login_View;

public class SistemTokoAlatTulis 
{

    public static void main(String[] args) throws SQLException 
    {
        new Login_View().show();
    }
    
}