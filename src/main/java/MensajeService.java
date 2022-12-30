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
	
	}
	
	public static void borrarMensaje() {
		
	}
	
	public static void editarMensaje() {
		
	}
	
	
}
