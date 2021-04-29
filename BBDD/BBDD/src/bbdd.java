
	import com.mysql.jdbc.PreparedStatement;
	import com.mysql.jdbc.Statement;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.DriverManager;
	import java.sql.SQLException;
public class bbdd {

	
	public static void main(String[] args) {
		
		Connection conexion= null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Tuve que cambiar al antiguo driver para funcionar
			
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/agenda?serverTimezone=UTC", "root", "1234");
			
			if(conexion!=null) {
				System.out.println("Conexion realizada con exito!!");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Hola");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Hola2");
		}finally {
			try {
				if(conexion!=null) {
					conexion.close();
					System.out.println("Conexión cerrada");
				}
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Hola");
			}
		}

	}

}
