
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Scanner;
	import java.sql.PreparedStatement;
public class insert {

	
	public static void main(String[] args) {
		Connection conexion = null;
		PreparedStatement statement = null;//Usar para inserts prepared
		
		Scanner lector = new Scanner (System.in);
		String nombre, apellido1,apellido2,teléfono;
		
		System.out.println("Escribe el nombre");
		nombre = lector.nextLine();
		System.out.println("Escribe el apellido 1");
		apellido1 = lector.nextLine();
		System.out.println("Escribe el apellido 2");
		apellido2 = lector.nextLine();
		System.out.println("Escribe el teléfono");
		teléfono = lector.nextLine();
		lector.close();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conexion= DriverManager.getConnection("jdbc:mysql://localhost/agenda?serverTimezone=UTC", "root", "1234");
			
			statement = conexion.prepareStatement("INSERT INTO Contactos VALUES (?,?,?,?)");
			statement.setString(1,nombre);
			statement.setString(2,apellido1);
			statement.setString(3,apellido2);
			statement.setString(4,teléfono);
			
			//se ejecuta y ver si ok
			int retorno = statement.executeUpdate();
			if (retorno>0) {
				System.out.println("Insertado");
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
