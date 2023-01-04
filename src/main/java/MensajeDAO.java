import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {
 
	
	
	public static void crearMensajeDB(MensajeEntity mensaje) {
		Conexion db_connect= new Conexion();
		try(Connection conexion= db_connect.getConection()){
			PreparedStatement ps= null;
			try {
				String query ="INSERT INTO message (message, autor_message) VALUES (?,?)";
				ps=conexion.prepareStatement(query);
				ps.setString(1, mensaje.getMensaje());
				ps.setString(2, mensaje.getAutor_mensaje());
				ps.executeUpdate();
				System.out.println("mensaje creado");
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	
		
	}
	
	
	public static void leerMensajesDB  () {
		Conexion db_connect= new Conexion();
		PreparedStatement ps= null;
		String query ="SELECT * FROM `message`";
		ResultSet rs=null;
		
		try(Connection conexion= db_connect.getConection()){
			ps=conexion.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("id_message"));
				System.out.println("mensaje: "+rs.getString("message"));
				System.out.println("autor: "+rs.getString("autor_message"));
				System.out.println("fecha: 2"+rs.getString("fecha_menssage"));
			}
		}catch (SQLException e) {
			System.out.println("no se pudieron cargar los mensajes");
			System.out.println(e);
		}
			
			
	}
	
	public static void borrarMensajeDB(int id_mensaje) {
		Conexion conexion = new Conexion();
		PreparedStatement ps=null;
		String query="DELETE FROM message WHERE id_message = ?";
		ResultSet rs=null;
		try(Connection connection= conexion.getConection()){
			ps=connection.prepareStatement(query);
			ps.setInt(1, id_mensaje);
			ps.executeUpdate();
			System.out.println("su mensaje fue borrado");
		}catch(SQLException e){
				System.out.println(e);
				System.out.println("no se pudo borrar el mensaje");
			}
			
		
		
	}
	
	public static void actualizarMensajeDB(MensajeEntity mensaje) {
		Conexion conexion= new Conexion();
		PreparedStatement ps=null;
		String query="UPDATE message SET message = ? WHERE id_message = ?";
		ResultSet rs=null;
		try(Connection connection = conexion.getConection()){
			ps=connection.prepareStatement(query);
			ps.setString(1, mensaje.getMensaje() );
			ps.setInt(2, mensaje.getId_mensaje());
			ps.executeUpdate();
			System.out.println("se actualizo el mensaje");
		}catch(SQLException e) {
			System.out.println(e);
			System.out.println("no se pudo actualizar el mensaje");
		}
		
		
	}
	
	
	
	
	
}
