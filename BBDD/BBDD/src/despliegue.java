
	import com.mysql.jdbc.PreparedStatement;
	import com.mysql.jdbc.Statement;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.DriverManager;
	import java.sql.SQLException;
public class despliegue {

	public static void main(String[] args) {
		Connection conexion = null;
		Statement statement = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conexion= DriverManager.getConnection("jdbc:mysql://localhost/agenda?serverTimezone=UTC", "root", "1234");
			
			statement = (Statement) conexion.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM CONTACTOS WHERE nombre='Antonio'");
			
			while (rs.next()) {
				System.out.println(rs.getString("NOMBRE")+" "+rs.getString("APELLIDO1")+" "+rs.getString("APELLIDO2")+" "+ rs.getString("TELÉFONO"));
			}
		}catch (SQLException e ) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (conexion!=null) {
					conexion.close();
					statement.close();
				}
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

}
