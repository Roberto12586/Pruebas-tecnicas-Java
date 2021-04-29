
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.PreparedStatement;
public class update {

	
	public static void main(String[] args) {
		Connection conexion = null;
		PreparedStatement statement = null;//Usar para inserts prepared
	
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conexion= DriverManager.getConnection("jdbc:mysql://localhost/agenda?serverTimezone=UTC", "root", "1234");
			
			statement = conexion.prepareStatement("UPDATE CONTACTOS SET NOMBRE= 'Enrique' WHERE APELLIDO1='López'");
			
			//se ejecuta y ver si ok
			int retorno = statement.executeUpdate();
			if (retorno>0) {
				System.out.println("Actualizado");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (conexion !=null) {
					conexion.close();
				}
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
