import Controlador.controler;
import Modelo.juego;
import Vista.interfaz;

public class Main {

	public static void main(String[] args) 
	{
		juego modelo = new juego();
		interfaz vista = new interfaz();
		controler controler = new controler(vista, modelo);
		controler.iniciarVista();
		vista.setVisible(true);
	}

}
