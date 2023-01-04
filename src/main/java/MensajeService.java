import java.util.Scanner;

public class MensajeService {
	
	public static void crearMensaje() {
		Scanner sc=new Scanner(System.in);
		MensajeEntity mensaje= new MensajeEntity();
		
		System.out.println("introdusca su mensaje");
		String mensajeR=sc.nextLine();
		
		System.out.println("nombre");
		String nombre=sc.nextLine();
		
		System.out.println("fecha");
		String fecha=sc.nextLine();
		
		mensaje.setMensaje(mensajeR);
		mensaje.setAutor_mensaje(nombre);
		mensaje.setFecha_mensaje(fecha);
		
		MensajeDAO.crearMensajeDB(mensaje);
		
		
	}
	
	public static void listarMensaje() {
		MensajeDAO.leerMensajesDB();
	
	}
	
	public static void borrarMensaje() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Que mensaje desea eliminar (indice)");
		int indice=sc.nextInt();
		
		MensajeDAO.borrarMensajeDB(indice);
		
	}
	
	public static void editarMensaje() {
		MensajeEntity nuevo=new MensajeEntity();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("indique el nuevo mensaje ");
		String mensaje=sc.nextLine();
		nuevo.setMensaje(mensaje);
		System.out.println("indique que mensaje quiere actualizar ");
		int indice=sc.nextInt();
		nuevo.setId_mensaje(indice);
		
		
		MensajeDAO.actualizarMensajeDB(nuevo);
		
	}
	
	
}
