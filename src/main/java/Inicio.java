import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("--------------------------");
			System.out.println("Aplicacion de mensajes");
			System.out.println("- 1. Crear mensaje");
			System.out.println("- 2. Listar mensaje");
			System.out.println("- 3. Editae mensaje");
			System.out.println("- 4. Eliminar mensaje");
			System.out.println("- 5. SALIR");
			//leemos la opcion del usuario
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				MensajeService.crearMensaje();
				break;
			
			case 2: 
				MensajeService.listarMensaje();
				break;
				
			case 3: 
				MensajeService.editarMensaje();
				break;
			
			case 4:
				MensajeService.borrarMensaje();
				break;
				
			default:
				break;
		}
		}while(opcion !=5);
		
		
		Conexion conexion= new Conexion();
		
		try(Connection cnx= conexion.getConecction()){
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
